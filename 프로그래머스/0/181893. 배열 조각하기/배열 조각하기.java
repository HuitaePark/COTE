import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int l = 0, r = arr.length - 1;

        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {      
                r = l + query[i];
            } else {               
                l = l + query[i];
            }
        }

        return Arrays.copyOfRange(arr, l, r + 1);
    }
}