import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] alphabet = new int[26];
        String answer = sc.next();
        
        
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = -1;
        }

      
        for (int i = 0; i < answer.length(); i++) {
            char c = answer.charAt(i);
            int index = c - 'a'; 
            if (alphabet[index] == -1) {
                alphabet[index] = i;
            }
        }


        for (int i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i] + " ");
        }
        sc.close();
    }
}