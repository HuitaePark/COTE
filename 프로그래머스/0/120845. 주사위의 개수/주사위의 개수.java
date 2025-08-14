import java.util.stream.*;
import java.util.*;
class Solution {
    public int solution(int[] box, int n) {
        return Arrays.stream(box).map(a -> a/n).reduce(1,(a,b) -> a*b);
    }
}