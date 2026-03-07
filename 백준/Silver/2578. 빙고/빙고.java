import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int[][] arr = new int[5][5];
    Map<Integer,int[]> map = new HashMap<>();
    for(int i=0;i<5;i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      for(int j=0;j<5;j++){
        int current = Integer.parseInt(st.nextToken());
        arr[i][j] = current;
        map.put(current,new int[]{i,j});
      }
    }
    
    int count = 0;
    int bingo = 0;
    a:for(int i=0;i<5;i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      for(int j=0;j<5;j++){
        int current = Integer.parseInt(st.nextToken());
        count++;
        if(map.containsKey(current)){
          int[] pos = map.get(current);
          arr[pos[0]][pos[1]] = -1;
        }
        bingo = check(arr);
        if(bingo>=3) break a;
      }
    }
    
    sb.append(count);
    bw.write(sb.toString());
    bw.flush();
  }
  static int check(int[][] board){
    int bingo = 0;
    //가로 검사
    for(int i=0;i<5;i++){
      boolean oneBingo = true;
      for(int j=0;j<5;j++){
        if(board[i][j]!=-1) oneBingo = false;
      }
      if(oneBingo) bingo++;
    }
    //세로 검사
    for(int i=0;i<5;i++){
      boolean oneBingo = true;
      for(int j=0;j<5;j++){
        if(board[j][i]!=-1) oneBingo = false;
      }
      if(oneBingo) bingo++;
    }
    //대각선 검사 우상향
    if(board[0][4]==-1 && board[1][3]==-1 && board[2][2]==-1 && board[3][1]==-1 && board[4][0]==-1)
      bingo++;
    //대각선 검사 좌상향
    if(board[0][0]==-1 && board[1][1]==-1 && board[2][2]==-1 && board[3][3]==-1 && board[4][4]==-1)
      bingo++;
    
    return bingo;
  }
}
