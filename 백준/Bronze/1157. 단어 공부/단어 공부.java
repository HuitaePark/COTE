import java.io.*;
import java.util.*;



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        str = str.toUpperCase();
        int maxCount = 0;
        int maxChar = 0;
        int count = 0;
        char[] arr = str.toCharArray();
        int[] intArr = new int[26];
        for (char i : arr){
            intArr[i-'A']++;
        }
        for (int i = 0; i < 26; i++) {
            if(intArr[i]>maxCount){
                maxCount = intArr[i];
                maxChar = i;
            }
        }
        for (int i = 0; i < 26; i++) {
            if(intArr[i]==maxCount){
                count++;
            }
        }
        char answer = (char) (maxChar+'A');
        if(count>1){
            System.out.println("?");
        }
        else{
            System.out.println(answer);
        }

    }
}