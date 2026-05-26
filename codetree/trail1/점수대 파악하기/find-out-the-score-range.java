import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] arr = new int[10];
        for(int i=0;i<100;i++){
            int current = Integer.parseInt(st.nextToken());
            if(current==0) break;
            if(current<10) continue;
            arr[current/10-1]++;
        }

        for(int i=arr.length-1;i>=0;i--){
            sb.append((i+1)*10).append(" - ").append(arr[i]).append("\n");
        }

        System.out.print(sb);
    }
}