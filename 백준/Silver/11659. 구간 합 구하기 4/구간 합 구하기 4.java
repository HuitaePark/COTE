import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 효율적으로 읽어오기 위해 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // StringBuilder는 결과를 빠르게 저장하고 출력하기 위해 사용
        StringBuilder sb = new StringBuilder();

        // 첫 번째 줄 입력: n(배열 크기), m(구간 합 쿼리 개수)
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 배열 크기 n
        int m = Integer.parseInt(st.nextToken()); // 구간 합 쿼리 개수 m

        // 배열 A의 누적 합 배열 S 생성 (1-based indexing을 위해 크기를 n+1로 설정)
        long[] S = new long[n + 1];

        // 두 번째 줄 입력: 배열 A의 원소들
        // BufferedReader로 한 줄을 읽어온 뒤, StringTokenizer로 공백 기준으로 나눔
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            // StringTokenizer의 nextToken()으로 공백 기준으로 분리된 문자열을 하나씩 가져옴
            S[i] = S[i - 1] + Integer.parseInt(st.nextToken());
            // S[i] = S[i-1] + a[i] 형태로 누적 합 배열 생성
        }

        // 구간 합 쿼리 처리
        for (int q = 0; q < m; q++) {
            // 각 쿼리 입력: [i, j] 구간
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()); // 구간 시작
            int j = Integer.parseInt(st.nextToken()); // 구간 끝

            // 구간 합 계산: S[j] - S[i-1]
            sb.append(S[j] - S[i - 1]).append("\n");
        }

        // 결과 한 번에 출력
        System.out.print(sb.toString());
    }
}
