import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        int basicTime = fees[0];
        int basicPrice = fees[1];
        int unitTime = fees[2];
        int unitPrice = fees[3];

        Map<String, Pair> map = new HashMap<>();
        
        for(String s : records){
            String[] str = s.split(" ");
            String[] time = str[0].split("\\:");
            String currentNum = str[1];
            int currentTime = Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
            
            if(str[2].equals("IN")){
                if(map.containsKey(currentNum)){
                    Pair p = map.get(currentNum);
                    p.time = currentTime;
                    p.isParking = true; 
                } else {
                    map.put(currentNum, new Pair(currentTime, 0, true));
                }
            } else {
                Pair p = map.get(currentNum);
                int spentTime = currentTime - p.time;
                p.totalTime += spentTime;
                p.isParking = false; 
            }
        }

        int lastTime = 1439;
        for(Pair p : map.values()){
            if(p.isParking){
                p.totalTime += (lastTime - p.time);
                p.isParking = false;
            }
        }

        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        
        int[] answer = new int[list.size()]; 
        
        for(int i = 0; i < list.size(); i++){
            int charge = 0;
            Pair current = map.get(list.get(i));
            
            if(current.totalTime <= basicTime) {
                charge = basicPrice;
            } else {
                double extraTime = current.totalTime - basicTime;
                charge = basicPrice + (int)Math.ceil(extraTime / unitTime) * unitPrice;
            }
            
            answer[i] = charge;
        }
        
        return answer;
    }
    
    static class Pair {
        int time, totalTime;
        boolean isParking;
        
        public Pair(int time, int totalTime, boolean isParking){
            this.time = time;
            this.totalTime = totalTime;
            this.isParking = isParking;
        }
    }
}