import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int[] arr = new int[10];
        st = new StringTokenizer(br.readLine());
        
        for(int i=0;i<10;i++){
            int current = Integer.parseInt(st.nextToken());
            arr[i] = current;
            if(current%3==0){
                sb.append(arr[i-1]);
                break;
            }
        }

        System.out.print(sb);
    }
}