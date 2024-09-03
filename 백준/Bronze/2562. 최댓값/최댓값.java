import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	    int[] numbers = new int[9];
        int max = 0;
        int index = 0;
        for (int i = 0; i < 9; i++) {
            numbers[i] = sc.nextInt();
        }
        for(int i = 0; i<numbers.length;i++){
            if(numbers[i]>max){
                max = numbers[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index+1);
        sc.close();
    }
}