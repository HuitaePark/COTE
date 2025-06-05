/*

팩토리얼(!)은 다음과 같이 정의된다.

n!=n×(n−1)×(n−2)×⋯×2×1

즉, 5!=5×4×3×2×1=120이다.

n이 입력되면 n!의 값을 출력하시오.

이 문제는 반복문 for, while 등을 이용하여 풀수 없습니다.

금지 키워드 : for while goto

*/
import java.io.*;

public class Main{
    static int i = 1;
    static int sum = 1;

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        func(n);
        System.out.println(sum);
    }

    public static void func(int n){
        if(i>n) return;
        else{
            sum*=i;
            i++;
        }
        func(n);
    }
}
