import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		String st = sc.next();
        int index = sc.nextInt();
        char[] arr = st.toCharArray();
        for(int i=0;i<arr.length;i++){
             if(i==index-1){
                 System.out.println(arr[i]);
             }       
        }
        sc.close();
    }
}