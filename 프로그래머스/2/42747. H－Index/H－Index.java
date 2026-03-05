import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int size = citations.length;
        Arrays.sort(citations);
        for(int i=0;i<citations.length;i++){
            int current = citations[i];
            if(current>=size-i) return size-i;
        }
        return 0;
    }
}