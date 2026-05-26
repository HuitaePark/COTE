import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int[] arr = new int[4];
        for(int i=0;i<3;i++){
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int d = Integer.parseInt(st.nextToken());

            if(s.equals("Y") && d>=37) arr[0]++;
            else if(s.equals("N") && d>=37) arr[1]++;
            else if(s.equals("Y") && d<37) arr[2]++;
            else arr[3]++;
        }
        
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]).append(" ");
        }

        if(arr[0]>=2) sb.append("E");

        System.out.print(sb);
    }
}