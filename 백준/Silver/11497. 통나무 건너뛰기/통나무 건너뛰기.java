import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < n; i++) {
            int number = Integer.parseInt(br.readLine());
            int[] arr = new int[number];
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            for(int j = 0; j < number; j++) {
                arr[j] = Integer.parseInt(st.nextToken()); 
            }
            Arrays.sort(arr);
            
            int maxDiff = 0;
            for(int k = 0; k < number - 2; k++) {
                maxDiff = Math.max(maxDiff, arr[k+2] - arr[k]);
            }
            
            sb.append(maxDiff).append("\n");
        }  
        
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }
}