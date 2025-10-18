import java.util.stream.*;
import java.util.*;

class Solution {
    public int solution(int[] num_list) {
       int gob = Arrays.stream(num_list).reduce(1,(acc,n) -> acc * n);
       int sum = Arrays.stream(num_list).reduce(0, (acc, n) -> acc + n);
        int pow = (int)Math.pow(sum,2);
       return gob > pow ? 0 : 1;
    }
}