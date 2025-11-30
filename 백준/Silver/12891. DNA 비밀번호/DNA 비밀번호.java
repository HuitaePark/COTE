import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int s = Integer.parseInt(st.nextToken());//검사할 문자열의 길이
    int p = Integer.parseInt(st.nextToken());//윈도우의 길이
    int count = 0;
    String str = br.readLine();//검사할 문자열
    
    st = new StringTokenizer(br.readLine());
    int[] acgt = new int[4];
    for(int i = 0;i<4;i++){
      acgt[i] = Integer.parseInt(st.nextToken()); // 조건을 만족하는 ACGT 개수
    }

    int[] now = new int[4]; //현재 ACGT 개수 상황
    for(int i =0;i<p;i++){
      countACGT(str.charAt(i),now); // 초기 길이에서 개수를 셈
    }
    count = check(count,now,acgt);

    int startIndex = 0;
    int endIndex = p-1;
    while(endIndex!=s-1){ // 이미 개수를 센 상태이므로 왼쪽 맨끝을 제거 , 오른쪽 맨끝을 추가 후 상태를 셈
      deleteACGT(str.charAt(startIndex),now);
      startIndex++;
      endIndex++;
      countACGT(str.charAt(endIndex),now);
      count = check(count,now,acgt);
    }

    sb.append(count);
    bw.write(sb.toString());
    bw.flush();
  
  }
  
  private static void countACGT(char ch,int[] now){
      switch(ch){
        case 'A':
          now[0]++;
          break;

        case 'C':
          now[1]++;
          break;

        case 'G':
          now[2]++;
          break;

        case 'T':
          now[3]++;
          break;
      }
  }

  private static void deleteACGT(char ch,int[] now){
      switch(ch){
        case 'A':
          now[0]--;
          break;

        case 'C':
          now[1]--;
          break;

        case 'G':
          now[2]--;
          break;

        case 'T':
          now[3]--;
          break;
      }
  }

  private static int check(int count, int[] now, int[] acgt){
      boolean isSatisfing = true;
      
      for(int i =0;i<4;i++){
        if(now[i]<acgt[i]) isSatisfing = false;
      }
    
      if(isSatisfing) count++;

    return count;
  }
}
