import java.util.*;
import java.util.stream.*;
class Solution {
    public String solution(String myString) {
        return myString.chars().mapToObj(c -> c < 'l' ? "l" : String.valueOf((char)c)).collect(Collectors.joining());
            
    }
}