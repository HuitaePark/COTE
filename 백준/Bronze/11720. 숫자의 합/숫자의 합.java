import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String num = sc.next();
		int sum = 0;
		String[] arr = num.split("");
		int[] intArr = new int[arr.length];
		for(int i=0; i<arr.length; i++){
			intArr[i] = Integer.parseInt(arr[i]);
		}
		for(int i : intArr){
			sum+=i;
		}
		System.out.println(sum);
		sc.close();
    }
}