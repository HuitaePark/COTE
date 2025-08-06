import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};

        boolean[][] visited = new boolean[n][m];
        Queue<int[]> q = new LinkedList<>();

        // 1. 시작점 (1, 1) -> 코드상 (0, 0)으로 변환
        //    칸 수를 셀 때 시작점도 포함하므로 count는 1부터 시작
        q.add(new int[]{0, 0, 1});
        visited[0][0] = true;

        int result = 0; // 최종 결과를 저장할 변수

        while (!q.isEmpty()) {
            int[] now = q.poll();
            int nowX = now[0];
            int nowY = now[1];
            int count = now[2];

            // 2. 도착점 (N, M) -> 코드상 (n-1, m-1)로 변환하여 확인
            if (nowX == n - 1 && nowY == m - 1) {
                result = count;
                break; // 정답을 찾았으므로 탐색 종료
            }

            for (int i = 0; i < 4; i++) {
                int nx = nowX + dx[i];
                int ny = nowY + dy[i];

                // 배열 범위 체크
                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                
                // 이동 가능한 칸('1')이고, 아직 방문하지 않았다면 큐에 추가
                if (arr[nx].charAt(ny) == '1' && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    q.add(new int[]{nx, ny, count + 1});
                }
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}