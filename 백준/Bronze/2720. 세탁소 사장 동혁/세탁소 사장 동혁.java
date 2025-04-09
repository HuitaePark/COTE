import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;

        for(int i = 0;i<n;i++){
            int count = 0;
            int money = arr[i];

            while(quarter<=money){
                money -= quarter;
                count++;
            }
            sb.append(count+" ");
            count = 0;

            while(dime<=money){
                money -= dime;
                count++;
            }
            sb.append(count+" ");
            count = 0;

            while(nickel<=money){
                money -= nickel;
                count++;
            }
            sb.append(count+" ");
            count = 0;

            while(penny<=money){
                money -= penny;
                count++;
            }
            sb.append(count+" ").append("\n");

        }

        bw.write(sb.toString());
        bw.flush();
    }
}
