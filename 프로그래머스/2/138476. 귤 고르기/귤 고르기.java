import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<tangerine.length;i++){
            map.put(tangerine[i],map.getOrDefault(tangerine[i],0)+1);
            list.add(tangerine[i]);
        }
        Collections.sort(list,(a,b)->{
            if(map.get(b)!=map.get(a)) return map.get(b)-map.get(a);
            return a-b;
        });
        
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<k;i++){
            set.add(list.get(i));
        }
        
        return set.size();
    }
}