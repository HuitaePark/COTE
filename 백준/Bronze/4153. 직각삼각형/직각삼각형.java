import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());

            // 종료 조건: 모든 값이 0일 때
            if (w == 0 && h == 0 && p == 0) {
                break;
            }

            // 피타고라스 정리 확인
            String result = "wrong";
            int[] sides = {w, h, p};
            Arrays.sort(sides); // 오름차순 정렬

            if (sides[0] * sides[0] + sides[1] * sides[1] == sides[2] * sides[2]) {
                result = "right";
            }

            System.out.println(result);
        }
    }
}
