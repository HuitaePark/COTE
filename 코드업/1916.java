/*

피보나치 수열이란 앞의 두 수를 더하여 나오는 수열이다.

첫 번째 수와 두 번째 수는 모두 1이고, 세 번째 수부터는 이전의 두 수를 더하여 나타낸다. 피보나치 수열을 나열해 보면 다음과 같다.

 

1,1,2,3,5,8,13…

 

자연수 N을 입력받아 N번째 피보나치 수를 출력하는 프로그램을 작성하시오.

단, N이 커질 수 있으므로 출력값에 10,009를 나눈 나머지를 출력한다.

※ 이 문제는 반드시 재귀함수를 이용하여 작성 해야한다.

금지 키워드 : while goto for

*/
import java.io.*;

public class Main {
    static long[] memo;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        memo = new long[n + 1];
        memo[0] = 1;
        memo[1] = 1;
        long answer = fibo(n);
        System.out.println(answer);
    }

    public static long fibo(int n) {
        if (n <= 2) return 1;
        if (memo[n] != 0) return memo[n];
        return memo[n] = (fibo(n - 1) + fibo(n - 2))%10009;
    }
}
