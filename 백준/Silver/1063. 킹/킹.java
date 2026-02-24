import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    String king  = st.nextToken();
    String stone = st.nextToken();
    int n = Integer.parseInt(st.nextToken());
    int kingC = king.charAt(0)-'A';
    int kingR = Character.getNumericValue(king.charAt(1));
    int stoneC = stone.charAt(0)-'A';
    int stoneR = Character.getNumericValue(stone.charAt(1));

    for(int i=0;i<n;i++){
      String move = br.readLine();
      int nr = 0;
      int nc = 0;
      switch(move){
        case "R":
          nr = kingR;
          nc = kingC+1;
          if (nc < 0 || nc > 7 || nr < 1 || nr > 8) continue;
          if(nr==stoneR && nc==stoneC){
            if(stoneC+1>=8) continue;
            stoneC++;
          } 
          kingR = nr;
          kingC = nc;
          break;
        case "L":
          nr = kingR;
          nc = kingC-1;
          if (nc < 0 || nc > 7 || nr < 1 || nr > 8) continue;
          if(nr==stoneR && nc==stoneC){
            if(stoneC-1<0) continue;
            stoneC--;
          } 
          kingR = nr;
          kingC = nc;
          break;
        case "B":
          nr = kingR-1;
          nc = kingC;
          if (nc < 0 || nc > 7 || nr < 1 || nr > 8) continue;
          if(nr==stoneR && nc==stoneC){
            if(stoneR-1<1) continue;
            stoneR--;
          } 
          kingR = nr;
          kingC = nc;
          break;
        case "T":
          nr = kingR+1;
          nc = kingC;
          if (nc < 0 || nc > 7 || nr < 1 || nr > 8) continue;
          if(nr==stoneR && nc==stoneC){
            if(stoneR+1>8) continue;
            stoneR++;
          } 
          kingR = nr;
          kingC = nc;
          break;
        case "RT":
          nr = kingR+1;
          nc = kingC+1;
          if (nc < 0 || nc > 7 || nr < 1 || nr > 8) continue;
          if(nr==stoneR && nc==stoneC){
            if(stoneR+1>8 || stoneC+1>=8) continue;
            stoneC++;
            stoneR++;
          } 
          kingR = nr;
          kingC = nc;
          break;
        case "LT":
          nr = kingR+1;
          nc = kingC-1;
          if (nc < 0 || nc > 7 || nr < 1 || nr > 8) continue;
          if(nr==stoneR && nc==stoneC){
            if(stoneR+1>8 || stoneC-1<0) continue;
            stoneC--;
            stoneR++;
          } 
          kingR = nr;
          kingC = nc;
          break;
        case "RB":
          nr = kingR-1;
          nc = kingC+1;
          if (nc < 0 || nc > 7 || nr < 1 || nr > 8) continue;
          if(nr==stoneR && nc==stoneC){
            if(stoneR-1<1 || stoneC+1>8) continue;
            stoneC++;
            stoneR--;
          } 
          kingR = nr;
          kingC = nc;
          break;
        case "LB":
          nr = kingR-1;
          nc = kingC-1;
          if (nc < 0 || nc > 7 || nr < 1 || nr > 8) continue;
          if(nr==stoneR && nc==stoneC){
            if(stoneR-1<1 || stoneC-1<0) continue;
            stoneC--;
            stoneR--;
          } 
          kingR = nr;
          kingC = nc;
          break;
      }
    }
    sb.append((char)(kingC+'A')).append(kingR).append("\n");
    sb.append((char)(stoneC+'A')).append(stoneR);
    bw.write(sb.toString());
    bw.flush();
  }
}
