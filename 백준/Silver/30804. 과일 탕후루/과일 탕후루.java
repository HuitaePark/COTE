import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        Map<Integer, Integer> map = new HashMap<>();

        int maxLength = 0;
        int left = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            while (map.size() > 2) {
                map.put(arr[left], map.get(arr[left]) - 1);

                if (map.get(arr[left]) == 0) {
                    map.remove(arr[left]);
                }
                left++;
            }
            maxLength = Math.max(maxLength, i - left + 1);
        }

        sb.append(maxLength);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}