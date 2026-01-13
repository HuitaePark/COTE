import java.util.*;
import java.io.*;

public class Main {
    static class Pair {
        int x, y;
        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Queue<Pair> runQ = new ArrayDeque<>();
        Queue<Pair> fireQ = new ArrayDeque<>();
        
        char[][] miro = new char[n][m];
        int[][] visited = new int[n][m]; // 지훈 이동 시간
        int[][] fired = new int[n][m];   // 불 확산 시간
        
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                char cur = s.charAt(j);
                miro[i][j] = cur;
                
                // 기본적으로 0으로 초기화되므로, 불/벽 등의 처리를 명확히 해야 함
                if (cur == 'J') {
                    runQ.offer(new Pair(i, j));
                    visited[i][j] = 1; // 시작 시간 1
                } else if (cur == 'F') {
                    fireQ.offer(new Pair(i, j));
                    fired[i][j] = 1;   // 시작 시간 1
                }
            }
        }

        //불의 BFS
        while (!fireQ.isEmpty()) {
            Pair current = fireQ.poll();
            
            for (int dir = 0; dir < 4; dir++) {
                int nx = current.x + dx[dir];
                int ny = current.y + dy[dir];
                
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (fired[nx][ny] > 0 || miro[nx][ny] == '#') continue; // 이미 불이 났거나 벽이면 패스
                
                fired[nx][ny] = fired[current.x][current.y] + 1;
                fireQ.add(new Pair(nx, ny));
            }
        }

        //지훈이의 BFS
        while (!runQ.isEmpty()) {
            Pair current = runQ.poll();
            int cx = current.x;
            int cy = current.y;

            //큐에서 꺼낸 위치가 가장자리라면 즉시 탈출 성공
            if (cx == 0 || cy == 0 || cx == n - 1 || cy == m - 1) {
                bw.write(String.valueOf(visited[cx][cy]));
                bw.flush();
                return; // 프로그램 종료
            }

            for (int dir = 0; dir < 4; dir++) {
                int nx = cx + dx[dir];
                int ny = cy + dy[dir];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (visited[nx][ny] > 0 || miro[nx][ny] == '#') continue; // 이미 방문했거나 벽

                // 불이 지훈이보다 먼저 혹은 동시에 도착했다면 이동 불가
                // fired[nx][ny] == 0 인 경우는 불이 아예 안 난 곳이므로 이동 가능
                if (fired[nx][ny] != 0 && fired[nx][ny] <= visited[cx][cy] + 1) continue;

                visited[nx][ny] = visited[cx][cy] + 1;
                runQ.add(new Pair(nx, ny));
            }
        }

        // 큐가 빌 때까지 탈출 못했으면 실패
        bw.write("IMPOSSIBLE");
        bw.flush();
        bw.close();
        br.close();
    }
}