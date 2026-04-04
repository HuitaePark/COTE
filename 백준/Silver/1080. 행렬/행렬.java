import java.util.*;
import java.io.*;

public class Main {
    static int n, m;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        char[][] board = new char[n][m]; 
        char[][] answer = new char[n][m]; 

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                board[i][j] = s.charAt(j);
            }
        }

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                answer[i][j] = s.charAt(j);
            }
        }

        int count = 0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < m - 2; j++) {
                if (board[i][j] != answer[i][j]) {
                    flip(board, i, j);
                    count++;
                }
            }
        }

        if (isMatching(board, answer)) {
            System.out.println(count);
        } else {
            System.out.println("-1");
        }
    }

    static void flip(char[][] board, int r, int c) {
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (board[i][j] == '0') {
                    board[i][j] = '1';
                } else {
                    board[i][j] = '0';
                }
            }
        }
    }

    static boolean isMatching(char[][] arr1, char[][] arr2) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr1[i][j] != arr2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}