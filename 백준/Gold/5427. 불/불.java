import java.util.*;
import java.io.*;

public class Main {
    static class Pair {
        int r, c;
        public Pair(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int[] dr = {1, -1, 0, 0};
        int[] dc = {0, 0, 1, -1};
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            int[][] human = new int[h][w];
            int[][] fire = new int[h][w];
            char[][] miro = new char[h][w];
            Queue<Pair> qHuman = new ArrayDeque<>();
            Queue<Pair> qFire = new ArrayDeque<>();
            for (int r = 0; r < h; r++) {
                String s = br.readLine();
                for (int c = 0; c < w; c++) {
                    miro[r][c] = s.charAt(c);
                    fire[r][c] = 0;
                    human[r][c] = 0;
                    if (miro[r][c] == '#') {
                        fire[r][c] = -1;
                        human[r][c] = -1;
                    } else if (miro[r][c] == '@') {
                        qHuman.add(new Pair(r, c));
                        human[r][c] = 1;
                    } else if (miro[r][c] == '*') {
                        qFire.add(new Pair(r, c));
                        fire[r][c] = 1;
                    }
                }
            }

            // 불 번짐 BFS
            while (!qFire.isEmpty()) {
                Pair current = qFire.poll();
                for (int dir = 0; dir < 4; dir++) {
                    int nr = current.r + dr[dir];
                    int nc = current.c + dc[dir];
                    if (nr < 0 || nr >= h || nc < 0 || nc >= w) continue;
                    if (fire[nr][nc] != 0 || miro[nr][nc] == '#') continue; // 이미 불이 있거나 벽이면 pass
                    fire[nr][nc] = fire[current.r][current.c] + 1;
                    qFire.offer(new Pair(nr, nc));
                }
            }
            //탈출큐
            boolean isEscaped = false;
            escapeLoop:
            while (!qHuman.isEmpty()) {
                Pair current = qHuman.poll();
                for (int dir = 0; dir < 4; dir++) {
                    int nr = current.r + dr[dir];
                    int nc = current.c + dc[dir];
                    if (nr < 0 || nr >= h || nc < 0 || nc >= w) {
                        isEscaped = true;
                        sb.append(human[current.r][current.c]).append("\n");
                        break escapeLoop;
                    }
                    if (human[nr][nc] != 0 || miro[nr][nc] == '#') continue; // 이미 방문했거나 벽
                    if (fire[nr][nc] != 0 && fire[nr][nc] <= human[current.r][current.c] + 1) continue;
                    human[nr][nc] = human[current.r][current.c] + 1;
                    qHuman.offer(new Pair(nr, nc));
                }
            }
            if (!isEscaped) {
                sb.append("IMPOSSIBLE").append("\n");
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}