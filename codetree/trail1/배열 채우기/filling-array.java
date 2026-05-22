import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<10;i++){
            int current = sc.nextInt();
            if(current==0) break;
            arr[i] = current;
        }

        StringBuilder sb = new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==0) continue;
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb.toString());
    }
}