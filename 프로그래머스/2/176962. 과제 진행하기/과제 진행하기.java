import java.util.*;
class Solution {
    public String[] solution(String[][] plans) {
        String[] answer = new String[plans.length];
        int idx = 0;
        PriorityQueue<Subject> q =  new PriorityQueue<>((a,b)-> a.time - b.time);
        Stack<Subject> temp = new Stack<>();
        for(int i=0;i<plans.length;i++){
            String[] arr = plans[i];
            String[] times = arr[1].split(":");
            int sum = Integer.parseInt(times[0])*60+Integer.parseInt(times[1]);
            q.offer(new Subject(arr[0],sum,Integer.parseInt(arr[2])));
        }
        
        int currentTime = q.peek().time;
        Subject current = q.poll();
        while(current != null||!q.isEmpty() || !temp.isEmpty()){
            if(!q.isEmpty() && q.peek().time==currentTime){ //만약 현재시간이 큐의 peek만큼 됐을때 교체
                temp.push(current);
                current = q.poll();
            }

            current.spend--;
            currentTime++;
            if(current.spend==0){
                answer[idx++] = current.name;
                
                if(!temp.isEmpty()){
                    current = temp.pop();
                }
                else if(!q.isEmpty()){
                    current = q.poll();
                    currentTime = Math.max(current.time,currentTime);
                }
                else current = null;
                
            }
            if(current==null && !temp.isEmpty()){
                current = temp.pop();
            }
        }
        return answer;
    }
    static class Subject{
        String name;
        int time;
        int spend;
        
        public Subject(String name,int time, int spend){
            this.name = name;
            this.time = time;
            this.spend = spend;
        }
    }
        
}