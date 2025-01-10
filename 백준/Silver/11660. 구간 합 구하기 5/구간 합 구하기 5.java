import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        // 입력을 효율적으로 읽어오기 위해 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder는 결과를 빠르게 저장하고 출력하기 위해 사용
        StringBuilder sb = new StringBuilder();

        // 첫 번째 줄 입력: n(배열 크기), m(구간 합 쿼리 개수)
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 배열 크기 n
        int m = Integer.parseInt(st.nextToken()); // 구간 합 쿼리 개수 m

        // 2차원 배열 A와 누적 합 배열 D 선언 (1-based indexing)
        long[][] A = new long[n + 1][n + 1];
        long[][] D = new long[n + 1][n + 1];

        // 배열 A 입력
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine()); // 각 행의 데이터를 읽음
            for (int j = 1; j <= n; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 누적 합 배열 D 생성
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                D[i][j] = D[i][j - 1] + D[i - 1][j] - D[i - 1][j - 1] + A[i][j];
            }
        }

        // 구간 합 쿼리 처리
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine()); // 쿼리 입력
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            // 구간 합 계산
            long result = D[x2][y2] - D[x1 - 1][y2] - D[x2][y1 - 1] + D[x1 - 1][y1 - 1];
            sb.append(result).append("\n");
        }

        // 결과 출력
        System.out.print(sb.toString());
    }
}
