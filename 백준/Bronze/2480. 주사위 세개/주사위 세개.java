import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // Reading input values
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int money = 0;
        
        if (a == b && b == c) {
            // All three numbers are the same
            money = 10000 + a * 1000;
        } else if (a == b || b == c || a == c) {
            // Two numbers are the same
            int same = (a == b) ? a : (b == c) ? b : a;
            money = 1000 + same * 100;
        } else {
            // All three numbers are different
            int max = Math.max(a, Math.max(b, c));
            money = max * 100;
        }
        
        System.out.print(money);
    }
}
