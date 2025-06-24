import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        double sum = 0; // double 타입으로 변경
        int[] numArr = new int[8001]; // -4000 ~ 4000

        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            arr[i] = m;
            sum += m;
            numArr[m + 4000]++; // 오프셋을 더해 빈도수 계산
        }

        Arrays.sort(arr);

        // 1. 산술평균
        sb.append(Math.round(sum / n)).append("\n");

        // 2. 중앙값 (N은 홀수)
        sb.append(arr[n / 2]).append("\n");

        // 3. 최빈값
        int max_frequency = 0;
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] > max_frequency) {
                max_frequency = numArr[i];
            }
        }

        List<Integer> mode_candidates = new ArrayList<>();
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] == max_frequency) {
                mode_candidates.add(i - 4000); // 원래 숫자로 변환
            }
        }

        if (mode_candidates.size() > 1) {
            sb.append(mode_candidates.get(1)).append("\n");
        } else {
            sb.append(mode_candidates.get(0)).append("\n");
        }

        // 4. 범위
        sb.append(arr[n - 1] - arr[0]);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}