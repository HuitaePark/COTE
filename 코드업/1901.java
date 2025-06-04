import java.io.*;
/*

1부터 정수 n까지 출력하는 재귀함수를 설계하시오.

이 문제는 반복문 for, while 등을 이용하여 풀수 없습니다.

금지 키워드 : for while goto

*/

public class Main{
    static int i = 1;

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        arr(i,n);

        bw.write(sb.toString());
        bw.flush();

    }

    public static void arr(int num,int n){
        if(i>n) return;
        else{
            System.out.println(num);
            arr(++i,n);
        }
    }
}
