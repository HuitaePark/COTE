import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int[] arr = new int[101];
        st = new StringTokenizer(br.readLine());
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i]==0){
                sum+= (arr[i-1] + arr[i-2] + arr[i-3]);
                break;
            }
        }
        sb.append(sum);
        System.out.print(sb);
    }
}