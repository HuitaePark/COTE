import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String myString) {
        return myString.chars()
                .mapToObj(c -> (c == 'a' || c == 'A') 
                        ? "A" 
                        : String.valueOf((char) c).toLowerCase())
                .collect(Collectors.joining());
    }
}