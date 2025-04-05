import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        String B = st.nextToken();
        int N = Integer.parseInt(st.nextToken());
        int answer= 0;
        int index = B.length()-1;

        for(int i=0;i<B.length();i++){
            if(B.charAt(i)>='A'){
                answer+= (B.charAt(i)-'A'+10)*(int)Math.pow(N,index);
            }
            else{
                answer+= (B.charAt(i)-'0')*(int)Math.pow(N,index);
            }
            index--;
        }


        sb.append(answer);

        bw.write(sb.toString());
        bw.flush();
    }
}
