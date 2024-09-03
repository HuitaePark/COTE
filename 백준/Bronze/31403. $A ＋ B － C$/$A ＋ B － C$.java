import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String d = Integer.toString(a);
        String e = Integer.toString(b);
        String ab = d+e;
        int result = Integer.parseInt(ab);
        
        
        System.out.println(a+b-c);
        System.out.println(result-c);
        
        sc.close();
    }
}