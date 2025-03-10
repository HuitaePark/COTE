import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();
            int sum1 = 0;
            int sum2 = 0;
            boolean isStrfry = true;
            if(a.length() != b.length()){
              bw.write("Impossible" + "\n");
              continue;
            }
            int[] arr =new int[26];
            for(int j = 0; j<a.length();j++){
              arr[a.charAt(j)-'a']++;
              arr[b.charAt(j)-'a']--;
            }
            for(int j : arr){
              if(j!=0){
                isStrfry = false;
                break;
              }
            }
            
            if (isStrfry)
                bw.write("Possible" + "\n");
            else
                bw.write("Impossible" + "\n");
        }
        bw.flush();
    }
}