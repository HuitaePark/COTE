import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        
        int[] count = new int[3];
        
        for(int i=0;i<answers.length;i++){
            int current = answers[i];
            if(current == one[i%one.length]) count[0]++;
            if(current == two[i%two.length]) count[1]++;
            if(current == three[i%three.length]) count[2]++;
        }
        
        int max = 0;
        for(int i=0;i<count.length;i++){
            max = Math.max(count[i],max);
        }
        
        List<Integer> winner = new ArrayList<>();
        
        for(int i=0;i<count.length;i++){
            if(count[i]==max) winner.add(i+1);
        }
        
        Collections.sort(winner);
        
        return winner.stream().mapToInt(Integer::intValue).toArray();
    }
}