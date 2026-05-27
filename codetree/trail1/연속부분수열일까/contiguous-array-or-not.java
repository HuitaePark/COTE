import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] arr1 = new int[a];
        int[] arr2 = new int[b];
        boolean isSet = false;

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<arr1.length;i++){
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<arr2.length;i++){
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==arr2[0]){
                boolean isMatching = true;
                for(int j=0;j<b;j++){
                    if(i+j>=a) {
                        isMatching = false;
                        break;
                    }
                    if(arr1[i+j]!=arr2[j]) {
                        isMatching = false;
                        break;
                    }
                }
                if(isMatching) {
                    isSet = true;
                }
            }
        }

        if(isSet) sb.append("Yes");
        else sb.append("No");
        System.out.print(sb);
    }
}