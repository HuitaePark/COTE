import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        int max = 0;
        double sum = 0;
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]>max){
                max = (int) arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i]/max*100;
            sum +=arr[i];
        }
        // 평균 계산 후 소수점 둘째 자리 반올림
        double average = sum / n;
        double roundedAverage = Math.round(average * 100.0) / 100.0;

        // 결과 출력
        System.out.println(roundedAverage);
    }
}
