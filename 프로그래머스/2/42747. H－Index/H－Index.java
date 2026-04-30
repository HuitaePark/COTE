import java.util.*;
class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        for(int i=0;i<citations.length;i++){
            int current = citations[i];
            if(citations.length-i <= current) return citations.length-i;
        }
        return 0;
    }
}