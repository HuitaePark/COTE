import java.util.*;

class Solution {
    public int solution(String my_string) {
        String[] tokens = my_string.trim().split("\\s+");
        int sum = Integer.parseInt(tokens[0]);

        for (int i = 1; i < tokens.length; i += 2) {
            String op = tokens[i];
            int val = Integer.parseInt(tokens[i + 1]);

            if (op.equals("+")) sum += val;
            else if (op.equals("-")) sum -= val;
        }
        return sum;
    }
}