import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(br.readLine()); // 중복 자동 제거
        }

        String[] str = set.toArray(new String[0]);
        Arrays.sort(str, Comparator
                .comparingInt(String::length)
                .thenComparing(Comparator.naturalOrder()));
        for (String i : str){
            System.out.println(i);
        }
    }
}