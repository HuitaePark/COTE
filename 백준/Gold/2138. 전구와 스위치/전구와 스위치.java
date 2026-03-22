import java.util.*;
import java.io.*;

public class Main {
    static int n;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        char[] current = br.readLine().toCharArray();
        char[] target = br.readLine().toCharArray();
        
        //0번 스위치를 안 누른 경우
        char[] arr1 = current.clone();
        int count1 = 0;
        
        //0번 스위치를 누른 경우
        char[] arr2 = current.clone();
        int count2 = 1;
        turn(0, arr2);
        
        // 1번 스위치부터 n-1번 스위치까지 전진
        for(int i = 1; i < n; i++) {
            if(arr1[i-1] != target[i-1]) {
                turn(i, arr1);
                count1++;
            }
            if(arr2[i-1] != target[i-1]) {
                turn(i, arr2);
                count2++;
            }
        }
        
        boolean check1 = (arr1[n-1] == target[n-1]);
        boolean check2 = (arr2[n-1] == target[n-1]);
        
        if(check1 && check2) {
            System.out.println(Math.min(count1, count2)); // 둘 다 가능하면 최솟값
        } else if(check1) {
            System.out.println(count1); // 1번만 가능
        } else if(check2) {
            System.out.println(count2); // 2번만 가능
        } else {
            System.out.println("-1"); // 둘 다 불가능
        }
    }

    static void turn(int i, char[] arr) {
        for (int j = i - 1; j <= i + 1; j++) {
            if (j >= 0 && j < n) {
                arr[j] = (arr[j] == '0') ? '1' : '0';
            }
        }
    }
}