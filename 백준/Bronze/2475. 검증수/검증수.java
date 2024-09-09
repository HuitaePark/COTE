import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        for(int i=0;i<5;i++){
           arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            sum+= (arr[i]*arr[i]);
        }
        System.out.println(sum%10);
        sc.close();
    }
}