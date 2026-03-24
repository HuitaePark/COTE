import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        //과제들을 담아둘 리스트 (여기선 아직 큐에 넣지 않습니다!)
        List<Task> tasks = new ArrayList<>();
        int maxDay = 0; // 가장 늦은 마감일을 찾기 위한 변수
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int day = Integer.parseInt(st.nextToken());
            int score = Integer.parseInt(st.nextToken());
            tasks.add(new Task(day, score));
            maxDay = Math.max(maxDay, day); // 가장 늦은 마감일 갱신
        }

        //오로지 '점수'만 내림차순으로 정렬하는 우선순위 큐
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        int sum = 0;
        
        for (int d = maxDay; d >= 1; d--) {
            for (Task t : tasks) {
                if (t.day == d) {
                    pq.add(t.score);
                }
            }
            if (!pq.isEmpty()) {
                sum += pq.poll();
            }
        }

        System.out.println(sum);
    }
    
    static class Task {
        int day, score;
        public Task(int day, int score) {
            this.day = day;
            this.score = score;
        }
    }
}