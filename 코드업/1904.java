/*

시작수(a)와 마지막 수(b)가 입력되면

a부터 b까지의 모든 홀수를 출력하시오.

이 문제는 반복문 for, while 등을 이용하여 풀수 없습니다.

금지 키워드 : for while goto

*/
import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        arr(a,b);
    }

    public static void arr(int a,int b){
        if(a>b) return;
        else{
            if (a % 2 == 1) {
                System.out.println(a);
            }
            arr(++a,b);
        }
    }
}
