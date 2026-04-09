import java.util.*;
import java.io.*;

public class Main {
    static int R, C, K;
    static int[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        
        board = new int[R][C]; //노트북 

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int[][] sticker = new int[r][c];

            for (int j = 0; j < r; j++) {
                st = new StringTokenizer(br.readLine());
                for (int l = 0; l < c; l++) {
                    sticker[j][l] = Integer.parseInt(st.nextToken());
                }
            }

            // 스티커를 붙이는 로직 시도 (최대 4방향)
            attachSticker(sticker);
        }

        int ans = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (board[i][j] == 1) ans++;
            }
        }
        System.out.println(ans);
    }

    // 스티커를 붙이는 시도를 하는 메서드
    static void attachSticker(int[][] sticker) {
        for (int rot = 0; rot < 4; rot++) {
            int r = sticker.length;
            int c = sticker[0].length;

            // 노트북을 순회하며 붙일 수 있는 위치 찾기
            for (int i = 0; i <= R - r; i++) {
                for (int j = 0; j <= C - c; j++) {
                    if (isPastable(i, j, sticker)) {
                        // 붙일 수 있다면 바로 붙이고 해당 스티커 처리 종료
                        paste(i, j, sticker);
                        return; 
                    }
                }
            }
            // 다 찾아봤는데 못 붙였다면 90도 회전
            sticker = rotate(sticker);
        }
    }

    // (x, y) 위치에 스티커를 붙일 수 있는지 확인
    static boolean isPastable(int x, int y, int[][] sticker) {
        for (int i = 0; i < sticker.length; i++) {
            for (int j = 0; j < sticker[0].length; j++) {
                // 둘 다 1이면 겹치므로 불가능
                if (board[x + i][y + j] == 1 && sticker[i][j] == 1) {
                    return false;
                }
            }
        }
        return true;
    }

    // (x, y) 위치에 스티커를 붙임
    static void paste(int x, int y, int[][] sticker) {
        for (int i = 0; i < sticker.length; i++) {
            for (int j = 0; j < sticker[0].length; j++) {
                if (sticker[i][j] == 1) {
                    board[x + i][y + j] = 1;
                }
            }
        }
    }

    // 스티커 90도 시계방향 회전
    static int[][] rotate(int[][] sticker) {
        int r = sticker.length;
        int c = sticker[0].length;
        int[][] rotated = new int[c][r]; // 행과 열의 크기가 반전됨

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                rotated[i][j] = sticker[r - 1 - j][i];
            }
        }
        return rotated;
    }
}