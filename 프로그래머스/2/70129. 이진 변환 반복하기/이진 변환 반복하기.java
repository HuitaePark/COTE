import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(String s) {
        List<Integer> answer = new ArrayList<>();
        int count = 0;
        int remove = 0;
        
        while (!s.equals("1")) {
            StringBuilder bin = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    count++;
                } else {
                    bin.append('1');
                }
            }
            s = Integer.toBinaryString(bin.length());
            remove++;
        }
        
        answer.add(remove);
        answer.add(count);
        return answer;
    }
}