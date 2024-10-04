import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        Set<Integer> uniqueRemainders = new HashSet<>();
        
        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i = 0; i < arr.length; i++){
            uniqueRemainders.add(arr[i] % 42);  // 나머지를 Set에 추가 (중복 허용 X)
        }
        
        int count = uniqueRemainders.size(); 
        System.out.println(count);
        
        sc.close();
    }
}