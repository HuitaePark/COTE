import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String sick = br.readLine();
        String[] str = sick.split("\\-");


        int result = Arrays.stream(str[0].split("\\+"))
                           .mapToInt(Integer::parseInt)
                           .sum();

 
        for (int i = 1; i < str.length; i++) {
            int sum = Arrays.stream(str[i].split("\\+"))
                            .mapToInt(Integer::parseInt)
                            .sum();
            result -= sum; 
        }

        sb.append(result);
        bw.write(sb.toString());
        bw.flush();
    }
}