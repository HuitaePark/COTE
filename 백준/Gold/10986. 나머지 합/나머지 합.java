import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    long[] S = new long[n + 1];   
    S[0] = 0L;
    st = new StringTokenizer(br.readLine());
    for(int i = 1;i<=n;i++){
      int a = Integer.parseInt(st.nextToken());
      S[i] = S[i - 1] + a;
    }

    //나머지는 M-1까지만 발생하므로 각각 나머지의 수를 계산
    long[] cnt = new long[m];
    for(int i = 0;i<=n;i++){
      int r = (int)(S[i] % m);
      cnt[r]++;
    }

    //나머지의 개수중에 두개를 뽑는 경우의 수를 answer에다 덧셈
    long answer = 0L;
    for(int r = 0;r<m;r++){
      long c = cnt[r];
      answer+= c*(c-1)/2;
    }


    sb.append(answer);
    bw.write(sb.toString());
    bw.flush();
  
  }
}
