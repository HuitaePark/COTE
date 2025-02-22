import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        int end = 666;
        while(true){
            String str = Integer.toString(end);
            if(str.contains("666")){
                cnt++;
            }
            if(cnt == n)
                break;
            end++;
        }
        bw.write(Integer.toString(end));
        bw.flush();
    }
}