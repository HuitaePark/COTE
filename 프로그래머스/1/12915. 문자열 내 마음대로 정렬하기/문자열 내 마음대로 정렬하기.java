import java.util.*;
class Solution {
    public List<String> solution(String[] strings, int n) {
        List<String> list = new ArrayList<>();
        for(int i =0;i<strings.length;i++){
            list.add(strings[i]);
        }
        Collections.sort(list,(a,b)->{
            if(a.charAt(n) == b.charAt(n)){
                return a.compareTo(b);
            }
            return a.charAt(n) - b.charAt(n);
        });
        return list;
    }
}