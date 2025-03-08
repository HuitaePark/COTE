import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[10];
        int max = 0;
        while(n>0){
            int num = n%10;
            arr[num]++;
            n /= 10;
        }
        arr[6] = (arr[6] + arr[9] + 1) / 2;
        arr[9] = 0;
        for (int j : arr) {
            if (j > max)
                max = j;
        }
        bw.write(Integer.toString(max));
        bw.flush();
    }
}
