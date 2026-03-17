import java.util.*;
import java.io.*;
import java.math.BigInteger; // BigInteger 임포트 필수

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        BigInteger[] dp = new BigInteger[1001];

        dp[0] = BigInteger.ONE;
        dp[1] = BigInteger.ONE;

        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1].multiply(BigInteger.valueOf(i));
        }
        
        BigInteger top = dp[n];
        BigInteger bottom = dp[k].multiply(dp[n-k]);
        BigInteger result = top.divide(bottom).remainder(BigInteger.valueOf(10007));
        
        bw.write(result.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}