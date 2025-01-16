import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 배열 초기화
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        // 명령 처리
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1; // 0-based 인덱스
            int b = Integer.parseInt(st.nextToken()) - 1; // 0-based 인덱스
            Collections.reverse(list.subList(a, b + 1));
        }

        // 출력
        for (int num : list) {
            sb.append(num).append(" ");
        }
        System.out.println(sb);
    }
}