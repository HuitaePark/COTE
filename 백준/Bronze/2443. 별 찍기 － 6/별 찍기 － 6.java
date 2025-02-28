import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int m = 0;
        int n = Integer.parseInt(br.readLine());
      
        for (int i = n; i >=1 ; i--) {
            sb.append(" ".repeat(m)).append("*".repeat(i+i-1)).append("\n");
            m++;
        }
        System.out.println(sb);
    }
}