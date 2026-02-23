import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<numlist.length;i++){
            list.add(numlist[i]);
        }
        Collections.sort(list, (a, b) -> {
            int da = Math.abs(a - n);
            int db = Math.abs(b - n);

            if (da != db) return da - db;  // 거리 오름차순
            return b - a;                  // 거리가 같으면 값 내림차순
        });
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}