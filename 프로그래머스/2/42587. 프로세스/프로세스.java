import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        List<Job> list = new ArrayList<>();
        for(int i=0;i<priorities.length;i++){
            list.add(new Job(priorities[i],i));
        }
        while(list.size()!=0){
            Job current = list.get(0);
            list.remove(0);
            if(list.size()==0){
                answer++;
            }
            else{
                boolean isHigh = true;
                for(Job jobs : list){
                    if(jobs.value>current.value){
                        isHigh = false;
                        break;
                    }
                }
                if(isHigh){
                    answer++;
                    if(location==current.index) break;
                }
                else{
                    list.add(current);
                }
            }
        }
        return answer;
    }
    static class Job{
        int value,index;
        public Job(int value,int index){
            this.value = value;
            this.index = index;
        }
    }
}