import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int X,Y = 0;

        X = Math.min(x, (w - x));

        Y = Math.min(y, (h - y));

        if(X>Y)
            bw.write(Integer.toString(Y));
        else
            bw.write(Integer.toString(X));



        bw.flush();
    }
}
