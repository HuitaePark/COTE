import java.util.*;
class Solution {
    public int[] solution(String s) {
        List<Integer> list = new ArrayList<>();
        a:for(int i=0;i<s.length();i++){
            int index = i-1;
            int current = 1;
            while(index>=0){
                if(s.charAt(i)==s.charAt(index)){
                    list.add(current);
                    continue a;
                }
                index--;
                current++;
            }
            list.add(-1);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}