import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int count = 0;
        int n = Integer.parseInt(br.readLine());
        int sum = 1;
        while(count<2){
            if((sum*n%5)==0) count++;
            sb.append(sum*n).append(" ");
            sum++;
        }

        System.out.print(sb);
    }
}