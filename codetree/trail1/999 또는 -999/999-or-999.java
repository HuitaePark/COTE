import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while(true){
            int current = Integer.parseInt(st.nextToken());
            if(current==999 || current==-999) break;

            max = Math.max(current,max);
            min = Math.min(current,min);
         }
        sb.append(max).append(" ").append(min);
        System.out.print(sb);
    }
}