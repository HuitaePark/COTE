import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        for(int i=1;i<=10;i++){
            String current = st.nextToken();
            if(i==2 || i==5 || i==8){
                sb.append(current).append(" ");
            }
        }

        System.out.print(sb);
    }
}