/*

시작수(a)와 마지막 수(b)가 입력되면

a부터 b까지의 모든 홀수를 출력하시오.

이 문제는 반복문 for, while 등을 이용하여 풀수 없습니다.

금지 키워드 : for while goto

*/
import java.io.*;

public class Main{
    static int i = 1;
    static int sum = 0;

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        func(n);
        System.out.println(sum);
    }

    public static void func(int n){
        if(i>n) return;
        else{
            sum+=i;
            i++;
        }
        func(n);
    }
}
