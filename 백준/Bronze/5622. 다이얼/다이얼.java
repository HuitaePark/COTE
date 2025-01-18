import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            int[] arr = new int[10];
            int sec = 0;   
            char[] strArr = a.toCharArray();
        for (char c : strArr) {
            if (c >= 'A' && c <= 'C') {
                sec += 3;
            }
            if (c >= 'D' && c <= 'F') {
                sec += 4;
            }
            if (c >= 'G' && c <= 'I') {
                sec += 5;
            }
            if (c >= 'J' && c <= 'L') {
                sec += 6;
            }
            if (c >= 'M' && c <= 'O') {
                sec += 7;
            }
            if (c >= 'P' && c <= 'S') {
                sec += 8;
            }
            if (c >= 'T' && c <= 'V') {
                sec += 9;
            }
            if (c >= 'W' && c <= 'Z') {
                sec += 10;
            }
        }

            System.out.println(sec);

        }
    }