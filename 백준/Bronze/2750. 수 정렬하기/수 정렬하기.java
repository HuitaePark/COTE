import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> hash = new HashSet<>();
        for(int i=0;i<n;i++){
            hash.add(sc.nextInt());
        }
        Integer[] arr = hash.toArray(new Integer[0]);
        Arrays.sort(arr);
        for (Integer integer : arr) {
            System.out.println(integer);
        }
        sc.close();
    }
}