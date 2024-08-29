import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 테스트 케이스 개수 입력받기
        int T = sc.nextInt();
        
        // 각 테스트 케이스 처리
        for (int i = 0; i < T; i++) {
            int R = sc.nextInt();  // 반복 횟수 R
            String S = sc.next();  // 문자열 S
            
            // 결과를 저장할 StringBuilder 생성
            StringBuilder P = new StringBuilder();
            
            // 문자열 S의 각 문자를 R번 반복하여 P에 추가
            for (int j = 0; j < S.length(); j++) {
                char ch = S.charAt(j);
                for (int k = 0; k < R; k++) {
                    P.append(ch);
                }
            }
            
            // 결과 출력
            System.out.println(P.toString());
        }
        
        sc.close();
    }
}