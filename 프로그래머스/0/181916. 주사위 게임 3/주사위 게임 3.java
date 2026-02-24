import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] cnt = new int[7];
        cnt[a]++; cnt[b]++; cnt[c]++; cnt[d]++;

        int p = 0, q = 0, r = 0;      // 값 저장용
        int maxCnt = 0;

        // maxCnt와 p(가장 많이 나온 값) 찾기
        for (int i = 1; i <= 6; i++) {
            if (cnt[i] > maxCnt) {
                maxCnt = cnt[i];
                p = i;
            }
        }

        if (maxCnt == 4) {
            // 모두 p
            return 1111 * p;
        }

        if (maxCnt == 3) {
            // p가 3번, 나머지 q 1번
            for (int i = 1; i <= 6; i++) {
                if (cnt[i] == 1) {
                    q = i;
                    break;
                }
            }
            int x = 10 * p + q;
            return x * x;
        }

        if (maxCnt == 2) {
            // 2+2 또는 2+1+1
            int pairCount = 0;
            for (int i = 1; i <= 6; i++) {
                if (cnt[i] == 2) pairCount++;
            }

            if (pairCount == 2) {
                // 2+2: p,q
                int first = 0, second = 0;
                for (int i = 1; i <= 6; i++) {
                    if (cnt[i] == 2) {
                        if (first == 0) first = i;
                        else second = i;
                    }
                }
                return (first + second) * Math.abs(first - second);
            } else {
                // 2+1+1: p가 한 쌍, 나머지 q,r
                int prod = 1;
                for (int i = 1; i <= 6; i++) {
                    if (cnt[i] == 1) prod *= i; // q*r
                }
                return prod;
            }
        }

        // 모두 다름: 최솟값
        for (int i = 1; i <= 6; i++) {
            if (cnt[i] == 1) return i;
        }

        return 0; // 논리상 도달하지 않음
    }
}