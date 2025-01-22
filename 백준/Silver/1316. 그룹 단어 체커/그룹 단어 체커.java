import java.io.*;
import java.util.*;



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] abc = new int[26];
        char[] arr = new char[101];
        int count = 0;
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            boolean[] used = new boolean[26];
            boolean isGroupWord = true;

            for (int j = 0; j < str.length(); j++) {
                char current = str.charAt(j);
                if (j>0 && current != str.charAt(j-1)) {
                    if(used[current-'a']){
                        isGroupWord = false;
                        break;
                    }
                }
                if (j == 0 ||current != str.charAt(j-1)) {
                    used[current-'a'] = true;
                }

            }
            if(isGroupWord) count++;
        }


        System.out.println(count);
    }
}