import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        // 1. 이동 횟수는 공식 (2^n - 1)
        int totalMoves = (int) Math.pow(2, n) - 1;
        bw.write(totalMoves + "\n");

        hanoi(n, 1, 2, 3);
        
        // 3. 기록된 이동 과정을 출력합니다.
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    /**
     * 하노이탑 이동 순서를 재귀적으로 찾는 함수
     * @param N 옮길 원반의 개수
     * @param from 출발지 기둥
     * @param aux 보조 기둥
     * @param to 목적지 기둥
     */
    private static void hanoi(int N, int from, int aux, int to) {
        // 재귀 종료 조건: 옮길 원반이 1개일 때
        if (N == 1) {
            // 가장 작은 원반을 출발지(from)에서 목적지(to)로 옮기는 과정을 기록
            sb.append(from).append(" ").append(to).append("\n");
            return;
        }

        // 재귀 파트
        // 1. N-1개의 원반을 출발지(from)에서 보조 기둥(aux)으로 옮긴다.
        hanoi(N - 1, from, to, aux);

        // 2. 가장 큰 원반(N번 원반)을 출발지(from)에서 목적지(to)로 옮긴다.
        sb.append(from).append(" ").append(to).append("\n");

        // 3. 보조 기둥(aux)에 있는 N-1개의 원반을 목적지(to)로 옮긴다.
        hanoi(N - 1, aux, from, to);
    }
}
