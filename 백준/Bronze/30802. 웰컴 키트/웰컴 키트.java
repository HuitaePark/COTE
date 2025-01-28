import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[6];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0;i<6;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int tSum = 0;
        for(int i : arr){
            if (i%t == 0){
                tSum+= i/t;
            }
            else if(i==0){
                continue;
            }
            else{
            tSum += i/t+1;
            }
        }
        bw.write(tSum+"\n");
        bw.write(n/p+" "+n%p);


        bw.flush();

    }
}