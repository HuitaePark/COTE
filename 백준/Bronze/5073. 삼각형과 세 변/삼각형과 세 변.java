import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int a, b, c;
        
        while(true){
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            
            if(a == 0 && b==0 && c== 0){
                break;
            }
            
            int sum = a+b+c;
            int max = Math.max(a,Math.max(b,c));


            if (max >= sum - max) {
                sb.append("Invalid\n");
            } else if (a == b && a == c) {
                sb.append("Equilateral\n");
            } else if (a != b && a != c && b != c) {
                sb.append("Scalene\n");
            } else {
                sb.append("Isosceles\n");
            }

        }





        bw.write(sb.toString());
        bw.flush();

    }
}
