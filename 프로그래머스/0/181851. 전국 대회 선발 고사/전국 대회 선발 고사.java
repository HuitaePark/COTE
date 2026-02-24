import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        Map<Integer,Integer> map = new TreeMap<>();
        for(int i = 0;i<rank.length;i++){
            map.put(rank[i],i);
        }
        Arrays.sort(rank);
        int count = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(count==3) break;
            else{
                if(attendance[map.get(entry.getKey())]){
                    if(count==0){
                        answer+=10000*map.get(entry.getKey());
                        count++;
                    }
                    else if(count==1){
                        answer+=100*map.get(entry.getKey());
                        count++;
                    }
                    else if(count==2){
                        answer+=map.get(entry.getKey());
                        count++;
                    }
                }
            }
        }
        
        return answer;
    }
}