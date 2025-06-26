import java.util.stream.*;
import java.util.*;
class Solution {
    public int solution(String[] spell, String[] dic) {
        return  Arrays.stream(dic).anyMatch(word->Arrays.stream(spell).allMatch(s->word.contains(s)))? 1:2;
    }
}