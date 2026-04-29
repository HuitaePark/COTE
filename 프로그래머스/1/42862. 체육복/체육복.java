import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> reserveSet = new HashSet<>();

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i : lost) {
            lostSet.add(i);
        }

        for (int i : reserve) {
            reserveSet.add(i);
        }
        
        //도난 당했지만 여벌있는 학생
        for (int i : reserve) {
            if (lostSet.contains(i)) {
                lostSet.remove(i);
                reserveSet.remove(i);
            }
        }

        int answer = n - lostSet.size();
        
        for (int i : lost) {
            if (!lostSet.contains(i)) {
                continue;
            }

            if (reserveSet.contains(i - 1)) {
                reserveSet.remove(i - 1);
                answer++;
            } else if (reserveSet.contains(i + 1)) {
                reserveSet.remove(i + 1);
                answer++;
            }
        }

        return answer;
    }
}