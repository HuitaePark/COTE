import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Number of test cases
        
        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();  // Height (number of floors)
            int w = sc.nextInt();  // Width (number of rooms per floor)
            int b = sc.nextInt();  // Booking number
            
            // Calculate the floor and room number
            int floor = (b % h == 0) ? h : b % h;
            int roomNumber = (b - 1) / h + 1;
            
            // Format the room number as floor * 100 + roomNumber
            int room = floor * 100 + roomNumber;
            
            // Output the result
            System.out.println(room);
        }
        
        sc.close();
    }
}