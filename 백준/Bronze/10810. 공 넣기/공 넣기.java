import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 바구니의 수
        int M = Integer.parseInt(st.nextToken()); // 공을 넣는 횟수

        // 바구니 초기화 (모든 바구니에 0을 넣음)
        int[] baskets = new int[N];

        // M번의 공 넣기
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int i1 = Integer.parseInt(st.nextToken()) - 1; // 0-based 인덱스로 변환
            int j1 = Integer.parseInt(st.nextToken()) - 1; // 0-based 인덱스로 변환
            int k = Integer.parseInt(st.nextToken()); // 넣을 공의 번호

            // i번부터 j번까지 범위에 공 넣기
            for (int j = i1; j <= j1; j++) {
                baskets[j] = k;
            }
        }

        // 결과 출력
        for (int i = 0; i < N; i++) {
            sb.append(baskets[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}