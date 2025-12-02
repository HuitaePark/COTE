import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] challenger = new int[N+2];
        double total = stages.length;
        Map<Integer,Double> fails = new HashMap<>();
        for(int stage : stages){
            challenger[stage]++;
        }
        
        for(int i = 1;i<=N;i++){
            if(challenger[i]==0){
                fails.put(i,0.);
            }
            else{
                fails.put(i,challenger[i] / total);
                total -=challenger[i];
            }
        }
        return fails.entrySet().stream()
            .sorted((o1,o2)-> o1.getValue().equals(o2.getValue()) ? Integer.compare(o1.getKey(),o2.getKey()) : Double.compare(o2.getValue(),o1.getValue()))         
            .mapToInt(HashMap.Entry::getKey)
            .toArray();
       
        
    }
}