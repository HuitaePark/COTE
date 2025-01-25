import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String answer = br.readLine();
        StringBuilder sb = new StringBuilder(answer);
        sb.reverse();
        String st = sb.toString();

        if (answer.equals(st)){
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}