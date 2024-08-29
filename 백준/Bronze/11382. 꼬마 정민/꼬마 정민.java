import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        long a = sc.nextLong();  // 첫 번째 숫자 입력
        long b = sc.nextLong();  // 두 번째 숫자 입력
        long c = sc.nextLong();  // 세 번째 숫자 입력
        
        // 세 정수의 합을 출력
        System.out.println(a + b + c);
        
        sc.close();
    }
}