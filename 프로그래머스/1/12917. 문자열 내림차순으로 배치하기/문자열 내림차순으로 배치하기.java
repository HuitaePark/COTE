import java.util.*;

class Solution {
    public String solution(String s) {
        char[] answer = s.toCharArray();
        Arrays.sort(answer);

        StringBuilder sb = new StringBuilder(new String(answer));
        return sb.reverse().toString();
    }
}