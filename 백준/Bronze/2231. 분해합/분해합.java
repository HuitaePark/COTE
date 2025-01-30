import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        for(int i=n; i>=0; i--){
            if(i+ digitSum(i) == n)
                answer = i;
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }
    public static int digitSum(int n){
        int sum = 0;
        while(n!=0){
            sum+= n%10;
            n = n/10;
        }
        return sum;
    }
}