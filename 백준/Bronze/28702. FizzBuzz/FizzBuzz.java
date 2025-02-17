import java.io.*;
import java.util.*;

public class Main {
    public static boolean isParsable(String str) {
        return str.matches("-?\\d+");  // 정수인지 확인
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] arr = new String[3];
        int index = 0;
        int answer = 0;

        for (int i =0;i<3;i++){
            arr[i] = br.readLine();
        }

        for (int i = 0; i < 3; i++) {
            if (isParsable(arr[i])){
                index = i;
                break;
            }
        }

        if(index == 0){
            answer = Integer.parseInt(arr[index])+3;
        }
        else if(index == 1){
            answer = Integer.parseInt(arr[index])+2;
        }
        else{
            answer = Integer.parseInt(arr[index])+1;
        }

        if(answer%5 ==0 && answer%3 == 0){
            bw.write("FizzBuzz");
        }
        else if (answer % 5 == 0) {
            bw.write("Buzz");
        }
        else if (answer % 3 == 0) {
            bw.write("Fizz");
        }
        else {
            bw.write(Integer.toString(answer));
        }
        bw.flush();
    }
}
