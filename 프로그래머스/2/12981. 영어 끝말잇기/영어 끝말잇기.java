import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[]{0,0};
        Set<String> set = new HashSet<>();
        set.add(words[0]);
        
        for(int i=1;i<words.length;i++){
            String current = words[i];
            if(set.contains(current) || words[i-1].charAt(words[i-1].length()-1)!=current.charAt(0)){
                answer[0] = i%n+1;
                answer[1] = i/n+1;
                break;
            }
            set.add(current);
        }
        
        return answer;
    }
}