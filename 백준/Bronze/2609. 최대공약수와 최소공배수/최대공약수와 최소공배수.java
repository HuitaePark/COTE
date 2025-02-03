import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int gcd = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if(n>m){
            gcd = ggg(n,m);
        }
        else{
            gcd = ggg(m,n);
        }
        int gbd = n*m/gcd;
        bw.write(Integer.toString(gcd));
        bw.write("\n");
        bw.write(Integer.toString(gbd));
        bw.flush();
    }
    public static int ggg(int a,int b){
        if(b==0) return a;
        return ggg(b,a%b);
    }
}
