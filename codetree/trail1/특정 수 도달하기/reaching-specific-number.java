import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        for(int i=1;i<=10;i++){
            int current = sc.nextInt();
            if(current>=250){
                break;
            }
            sum+=current;
            count++;
        }
        
        double avg = (double)sum/count;
        System.out.printf("%d %.1f", sum, avg);
    }
}