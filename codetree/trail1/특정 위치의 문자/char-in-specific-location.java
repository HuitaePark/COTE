import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        
        String[] arr = {"L","E","B","R","O","S"};
        String answer = "None";
        for(int i=0;i<arr.length;i++){
            if(s.equals(arr[i])) answer = Integer.toString(i);
        }

        sb.append(answer);
        System.out.print(sb);
    }
}