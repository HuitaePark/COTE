import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        Set<String> set = new HashSet<>();
        
        // i는 부분 문자열의 시작 인덱스
        for (int i = 0; i < s.length(); i++) {
            // j는 부분 문자열의 끝 인덱스 (i+1부터 문자열 끝까지)
            for (int j = i + 1; j <= s.length(); j++) {
                // substring을 이용해 문자열을 잘라서 바로 Set에 추가
                set.add(s.substring(i, j));
            }
        }
        
        System.out.println(set.size());
    }
}