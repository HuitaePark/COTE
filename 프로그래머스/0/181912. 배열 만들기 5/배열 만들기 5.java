import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        for(int i =0;i<intStrs.length;i++){
            int current = Integer.parseInt(intStrs[i].substring(s,s+l));
            if(current>k)list.add(current);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}