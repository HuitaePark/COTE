import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());  //테스트 케이스 개수
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            int add = 0;  //더할 점수
            int score = 0;  //점수
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'O') {
                    add++;  //더할 점수 +1
                    score += add;  //총점수에 더함
                } else {
                    add = 0;  //X이면 더할 점수 초기화
                }
            }
            sb.append(score + "\n");
        }
        System.out.print(sb);
    }
}