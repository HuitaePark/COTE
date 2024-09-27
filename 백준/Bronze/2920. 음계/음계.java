import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        int[] ascending = {1,2,3,4,5,6,7,8};
        int[] descending = {8,7,6,5,4,3,2,1};
        int as = 0;
        int des = 0;
       
        for(int i = 0;i<8;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<8;i++){
            if(arr[i]==ascending[i]){
                as++;
            }
            else if(arr[i]==descending[i]){
                des++;
            }
        }
				
        if(as==8){
            System.out.println("ascending");
        }
        else if(des == 8){
            System.out.println("descending");
        }
        else{
            System.out.println("mixed");
        }
        sc.close();
    }
}