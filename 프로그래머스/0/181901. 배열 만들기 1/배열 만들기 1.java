import java.util.stream.*;
class Solution {
    public int[] solution(int n, int k) {
        return IntStream.iterate(k,(x)->x+k).takeWhile((x)->x<=n).toArray();
    }
}