import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long sum = 0;
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        long power = 1;
        int p = 31;
        long mod = 1234567891; // 모듈러 값

        for (int i = 0; i < n; i++) {
            int charValue = str.charAt(i) - 'a' + 1;
            sum = (sum + charValue * power) % mod;
            power = (power * p) % mod;
        }
        bw.write(Long.toString(sum));
        bw.flush();
    }
}
