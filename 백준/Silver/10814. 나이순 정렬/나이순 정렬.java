import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        String[][] str = new String[n][2];

        for(int i = 0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            str[i][0] = st.nextToken();
            str[i][1] = st.nextToken();
        }

        Arrays.sort(str, Comparator.comparingInt(o -> Integer.parseInt(o[0])));

        for(String[] s : str){
            bw.write(s[0]+" "+s[1]+"\n");
        }
        bw.flush();
    }
}
