import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < numbers.length; i++){
            list.add(String.valueOf(numbers[i]));
        }

        Collections.sort(list,(a,b)->(b+a).compareTo(a+b));

        for(String s : list){
            sb.append(s);
        }

        if(sb.charAt(0) == '0') return "0";

        return sb.toString();
    }
}