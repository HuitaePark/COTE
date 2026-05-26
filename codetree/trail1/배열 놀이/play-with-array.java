import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<q;i++){
            st = new StringTokenizer(br.readLine());
            int current = Integer.parseInt(st.nextToken());
            if(current==1){
                sb.append(arr[Integer.parseInt(st.nextToken())-1]).append("\n");
            }
            else if(current==2){
                int value = Integer.parseInt(st.nextToken());
                int answer = 0;
                for(int j = 0; j < n; j++){
                    if(arr[j] == value){
                        answer = j + 1;
                        break;
                    }
                }
                sb.append(answer).append("\n");
            }
            else{
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                for(int j=start-1;j<=end-1;j++){
                    sb.append(arr[j]).append(" ");
                }
                sb.append("\n");
            }
        }


        System.out.print(sb);
    }
}