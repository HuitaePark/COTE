import java.util.*;

class Solution {
    public int[] solution(String my_string) {
    return my_string.chars().filter(n -> 48<=n && n <=57).map(Character::getNumericValue).sorted().toArray();
    }
}