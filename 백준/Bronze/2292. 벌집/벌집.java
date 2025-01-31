import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int top = 7;
        int bottom = 2;
        int count = 2;
        int i =0;
        int n = Integer.parseInt(br.readLine());

        if(n == 1){
            bw.write(Integer.toString(n));
        }
        else if(2 <= n && n <= 7 ){
            bw.write("2");
        }
        else{
            while(true){
                i +=6;
                bottom +=i;
                top += i+6;
                count++;
                if(bottom <= n && n <= top){
                    bw.write(Integer.toString(count));
                    break;
                }
            }
        }
        bw.flush();
    }

}

