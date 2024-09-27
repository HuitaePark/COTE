import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	    int a =	sc.nextInt();
        int b =	sc.nextInt();
        int c =	sc.nextInt();
        int sum = a*b*c;
        int[] num = new int[10];
        while(sum>0){
            int result = sum % 10;
            num[result]++;
            sum/=10;
        }
        
        for(int i=0;i<num.length;i++){
          System.out.println(num[i]);   
        }
        sc.close();
    }
}