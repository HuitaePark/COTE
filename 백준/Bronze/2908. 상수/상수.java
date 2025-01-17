import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();
            sb.append(a).append(" ").append(b);
            sb.reverse();
            String str = sb.toString();
            String[] n = str.split(" ");
            if (Integer.parseInt(n[0])>Integer.parseInt(n[1])){
                System.out.println(n[0]);
            }
            else {
                System.out.println(n[1]);
            }

        }
    }
