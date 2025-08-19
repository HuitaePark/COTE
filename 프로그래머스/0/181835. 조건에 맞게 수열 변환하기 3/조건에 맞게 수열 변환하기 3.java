import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        return Arrays.stream(arr)
                .map(c -> {
                    if (k % 2 != 0) {
                        return c * k; 
                    } else {
                        return c + k;
                    }
                })
                .toArray();
    }
}