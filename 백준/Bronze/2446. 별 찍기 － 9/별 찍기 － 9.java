import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            sb.append(" ".repeat(i))
                    .append("*".repeat(2 * (n - i) - 1))
                    .append("\n");
        }
        int j = 2;
        for(int i = n-1; i >0; i--) {
            sb.append(" ".repeat(i-1))
                    .append("*".repeat(2*j-1))
                    .append("\n");
            j++;
        }
        System.out.print(sb);
    }
  }
