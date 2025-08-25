import java.util.stream.*;
class Solution {
    public int solution(String myString, String pat) {
        return myString.chars().mapToObj(c -> {
            if (c == 'A') return "B";
            if (c == 'B') return "A";
            return String.valueOf((char)c);
        }).collect(Collectors.joining()).contains(pat)? 1 : 0;
    }
}