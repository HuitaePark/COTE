import java.util.*;
import java.io.*;
  
public class Main{

  static int blue = 0;
  static int white = 0;
  
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int[][] arr = new int[n][n];
    for(int i =0;i<n;i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      for(int j = 0;j<n;j++){
        int k = Integer.parseInt(st.nextToken());
        if(k==1){
          arr[i][j] = 1;
        }
      }
    }
    


    divide(arr,0,0,n);

    sb.append(white).append("\n").append(blue);

    bw.write(sb.toString());
    bw.flush();
  
  }
  private static void divide(int[][] arr,int x ,int y, int length){
    if (isSameColor(arr, x, y, length)) {
            if (arr[x][y] == 1) {
                blue++;
            } else {
                white++;
            }
            return;
        }

        int newLen = length / 2;

        divide(arr, x, y, newLen); // 왼쪽 위
        divide(arr, x, y + newLen, newLen); // 오른쪽 위
        divide(arr, x + newLen, y, newLen); // 왼쪽 아래
        divide(arr, x + newLen, y + newLen, newLen); // 오른쪽 아래
  }
  private static boolean isSameColor(int[][] arr, int x, int y, int length) {
    int color = arr[x][y];
        for (int i = x; i < x + length; i++) {
            for (int j = y; j < y + length; j++) {
                if (arr[i][j] != color) {
                    return false;
                }
            }
        }
        return true;
    }
  }

