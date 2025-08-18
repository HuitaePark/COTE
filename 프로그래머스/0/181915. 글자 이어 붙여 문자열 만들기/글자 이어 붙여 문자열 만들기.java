import java.util.stream.*;

class Solution {
    public String solution(String my_string, int[] index_list) {
        return IntStream.range(0, index_list.length).mapToObj(i -> String.valueOf(my_string.charAt(index_list[i]))).collect(Collectors.joining());
    }
}