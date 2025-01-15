import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        String result = "No";
        int sum = 0;
        for (int i = 0; i < y; i++) {
            st = new StringTokenizer(br.readLine());
            int money = Integer.parseInt(st.nextToken());
            int count = Integer.parseInt(st.nextToken());
            sum += money *count;
        }
        if (sum == x){
            result = "Yes";
        }
        System.out.println(result);
    }
}
