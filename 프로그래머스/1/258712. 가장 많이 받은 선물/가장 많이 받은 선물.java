import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        Map<String, Map<String, Integer>> map = new HashMap<>();
        Map<String, Integer> score = new HashMap<>(); // 선물 지수

        for (String friend : friends) {
            map.put(friend, new HashMap<>());
            score.put(friend, 0); // 초기화
        }

        // 선물 주고받기 데이터 기록
        for (String gift : gifts) {
            String[] arr = gift.split(" "); // 공백 기준 분리
            String giver = arr[0];
            String receiver = arr[1];

            // 준 횟수 기록
            map.get(giver).put(receiver, map.get(giver).getOrDefault(receiver, 0) + 1);
            
            // 선물 지수 계산 (준 사람은 +1, 받은 사람은 -1)
            score.put(giver, score.get(giver) + 1);
            score.put(receiver, score.get(receiver) - 1);
        }

        int[] nextMonthGifts = new int[friends.length];
        for (int i = 0; i < friends.length; i++) {
            String me = friends[i];
            for (int j = 0; j < friends.length; j++) {
                if (i == j) continue;
                String you = friends[j];

                int giveCount = map.get(me).getOrDefault(you, 0);
                int receiveCount = map.get(you).getOrDefault(me, 0);

                if (giveCount > receiveCount) {
                    nextMonthGifts[i]++;
                } else if (giveCount == receiveCount) {
                    // 선물 지수 비교
                    if (score.get(me) > score.get(you)) {
                        nextMonthGifts[i]++;
                    }
                }
            }
        }

        for (int count : nextMonthGifts) {
            answer = Math.max(answer, count);
        }
        return answer;
    }
}