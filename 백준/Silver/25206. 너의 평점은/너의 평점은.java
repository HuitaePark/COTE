import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] subject = new String[20];
        double[] score = new double[20];
        String[] grade = new String[20];
        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            subject[i] = st.nextToken();
            score[i] = Double.parseDouble(st.nextToken());
            grade[i] = st.nextToken();
        }
        double sum = 0;
        double scoreSum = 0;
        for (int i = 0; i < 20; i++) {
            double n = 0;
            switch (grade[i]) {
                case "A+":
                    n = 4.5;
                    break;
                case "A0":
                    n = 4.0;
                    break;
                case "B+":
                    n = 3.5;
                    break;
                case "B0":
                    n = 3.0;
                    break;
                case "C+":
                    n = 2.5;
                    break;
                case "C0":
                    n = 2.0;
                    break;
                case "D+":
                    n = 1.5;
                    break;
                case "D0":
                    n = 1.0;
                    break;
                case "F":
                    n = 0.0;
                    break;
                case "P":
                    continue;
            }
            scoreSum += score[i];
            sum += score[i] * n;
        }
        System.out.println(sum / scoreSum);
    }
}
