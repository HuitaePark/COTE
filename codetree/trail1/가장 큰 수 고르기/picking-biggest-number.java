import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = 0;

        for(int i=0;i<10;i++){
            max = Math.max(max,Integer.parseInt(st.nextToken()));
        }
        sb.append(max);
        System.out.print(sb);
    }
}