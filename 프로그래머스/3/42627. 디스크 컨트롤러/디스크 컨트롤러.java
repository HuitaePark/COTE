import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int time = 0;
        int answer = 0;
        int idx = 0;
        int count = 0;

        // 요청 시간순 정렬
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);

        // 소요 시간이 짧은 작업 우선
        Queue<Node> q = new PriorityQueue<>(
            (a, b) -> a.spend - b.spend
        );

        while (count < jobs.length) {

            // 현재 시간까지 요청된 작업 추가
            while (idx < jobs.length &&
                   jobs[idx][0] <= time) {

                q.offer(new Node(
                    jobs[idx][0],
                    jobs[idx][1]
                ));
                idx++;
            }

            // 대기 중인 작업이 없다면
            if (q.isEmpty()) {
                time = jobs[idx][0];
                continue;
            }

            // 가장 짧은 작업 실행
            Node now = q.poll();

            time += now.spend;

            // 반환 시간 = 종료 시간 - 요청 시간
            answer += time - now.start;

            count++;
        }

        return answer / jobs.length;
    }

    class Node {
        int start, spend;

        public Node(int start, int spend) {
            this.start = start;
            this.spend = spend;
        }
    }
}