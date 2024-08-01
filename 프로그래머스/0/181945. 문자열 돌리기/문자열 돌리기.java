import java.util.Scanner;
import java.util.Arrays;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] arr = a.toCharArray();
        
        for(char i : arr){
            System.out.println(i);
        }
    }
}