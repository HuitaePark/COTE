import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        int day = 0;
        if( (V - B) % (A - B) == 0) {
            day = (V - B) / (A-B);
        }
        else {
            day = (V - B) / (A-B) + 1;
        }
        bw.write(Integer.toString(day));
        bw.flush();
    }
}