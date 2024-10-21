import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            String s = sc.nextLine();
            
            if (s.equals("0")) {
                break;  // 입력이 "0"이면 종료
            }

            // 문자열을 뒤집음
            StringBuilder sb = new StringBuilder(s);
            String reversed = sb.reverse().toString();

            // 원래 문자열과 뒤집은 문자열을 비교
            if (s.equals(reversed)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        
        sc.close();
    }
}