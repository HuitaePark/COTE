import java.util.stream.*;
class Solution {
    public String solution(String my_string) {
       return my_string.chars().map(Character::toLowerCase).sorted().mapToObj(s -> String.valueOf((char)s)).collect(Collectors.joining());
    }
}