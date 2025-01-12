import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 효율적으로 읽어오기 위해 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder는 결과를 빠르게 저장하고 출력하기 위해 사용
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        while (n>0){
            sb.append(n).append("\n");
            n--;
        }
        System.out.println(sb);
    }
}
