import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int room = 0;
        int[] F = new int[6];
        int[] M = new int[6];
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());
            if(s == 0)
                F[g-1]++;
            else
                M[g-1]++;
        }
        for(int i=0;i<6;i++){
            if(F[i]%k != 0){
              room += ((F[i])/k);
              room++;
            }
            else{
              room += ((F[i])/k);
            }
            if(M[i]%k != 0){
              room += ((M[i])/k);
              room++;
            }
            else{
              room += ((M[i])/k);
            }
            
        }
        bw.write(Integer.toString(room));
        bw.flush();
    }
}
