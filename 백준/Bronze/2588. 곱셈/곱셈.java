import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
        
        int digit1 = b%10;
        int digit2 = (b%100-digit1)/10;
        int digit3 = b/100;
        
       
        System.out.println(a*digit1);
        System.out.println(a*digit2);
        System.out.println(a*digit3);
        System.out.println(a*b);
    }
}