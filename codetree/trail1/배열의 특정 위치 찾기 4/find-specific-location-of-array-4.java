import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int sum = 0;
        int count = 0;
        for(int i=0;i<10;i++){
            int current = Integer.parseInt(st.nextToken());
            if(current==0) break;
            if(current%2==0){
                count++;
                sum+=current;
            }
        }
        sb.append(count).append(" ").append(sum);
        System.out.print(sb);
    }
}