import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		int min = 0;
		int[] arr = new int[n];
		for(int i = 0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		min = arr[0];
		max = arr[n-1];
		System.out.println(min+" "+max);
		sc.close();
    }
}