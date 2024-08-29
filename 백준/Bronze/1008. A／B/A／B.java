import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double a = s.nextDouble();
        double b = s.nextDouble();
        if(0<a || b>10)
        {
            System.out.println(a / b);
        }
    }
}
