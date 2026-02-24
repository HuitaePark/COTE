import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> ans = new ArrayList<>();
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.add(5);

        while (!q.isEmpty()) {
            int x = q.poll();

            if (x > r) continue;
            if (x >= l) ans.add(x);

            // 다음 자리 붙이기
            long x0 = (long) x * 10;      // x*10 + 0
            long x5 = (long) x * 10 + 5;  // x*10 + 5

            if (x0 <= r) q.add((int) x0);
            if (x5 <= r) q.add((int) x5);
        }

        if (ans.isEmpty()) return new int[]{-1};

        Collections.sort(ans);
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}