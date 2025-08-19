import java.util.stream.*;
class Solution {
    public int solution(int num, int k) {
        return IntStream.range(0,String.valueOf(num).length())
            .filter(i -> (String.valueOf(num).charAt(i)-'0')==k).map(i -> i + 1).findFirst().orElse(-1);
    }
}