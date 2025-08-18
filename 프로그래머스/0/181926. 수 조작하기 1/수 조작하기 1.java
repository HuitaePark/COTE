import java.util.stream.*;

class Solution {
    public int solution(int n, String control) {
        return control.chars()
            .map(c -> c == 'w' ? 1 
                   : c == 's' ? -1 
                   : c == 'd' ? 10 
                   : c == 'a' ? -10 
                   : 0)
            .reduce(n, (acc, x) -> acc + x);
    }
}