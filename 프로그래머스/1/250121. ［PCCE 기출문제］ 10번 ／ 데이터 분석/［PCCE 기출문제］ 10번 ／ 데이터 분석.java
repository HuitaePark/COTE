import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        Map<String,Integer> map = new HashMap<>();
        map.put("code",0);
        map.put("date",1);
        map.put("maximum",2);
        map.put("remain",3);
        
        return Arrays.stream(data)
            .filter(a->a[map.get(ext)]<val_ext)
            .sorted((a,b)-> Integer.compare(a[map.get(sort_by)],b[map.get(sort_by)]))
            .toArray(int[][]::new);
    }
}