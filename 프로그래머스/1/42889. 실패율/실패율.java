import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        Map<Integer, Integer> pass = new HashMap<>();
        Map<Integer, Integer> fail = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            pass.put(i, 0);
            fail.put(i, 0);
            answer[i - 1] = i;
        }

        for (int current : stages) {
            for (int j = 1; j < current && j <= N; j++) {
                pass.put(j, pass.get(j) + 1);
            }

            if (current <= N) {
                fail.put(current, fail.get(current) + 1);
            }
        }

        return Arrays.stream(answer)
            .boxed()
            .sorted((a, b) -> {
                int totalA = pass.get(a) + fail.get(a);
                int totalB = pass.get(b) + fail.get(b);

                double aa = totalA == 0
                    ? 0
                    : (double) fail.get(a) / totalA;

                double bb = totalB == 0
                    ? 0
                    : (double) fail.get(b) / totalB;

                int compare = Double.compare(bb, aa);

                if (compare == 0) {
                    return Integer.compare(a, b);
                }

                return compare;
            })
            .mapToInt(Integer::intValue)
            .toArray();
    }
}