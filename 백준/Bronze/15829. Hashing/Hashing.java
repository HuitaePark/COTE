import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        for(int i=0;i<n;i++){
            sum += (str.charAt(i)-'a'+1) * (int)Math.pow(31,i);
        }
        bw.write(Integer.toString(sum));
        bw.flush();
    }

}
