import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();

    
    int n = Integer.parseInt(br.readLine());
    Integer[] arr = new Integer[n];
    int[] answer = new int[n];
    Map<Integer,Integer> map = new HashMap<>();
    Set<Integer> set = new HashSet<>();
    //입력받기
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i=0;i<n;i++){
      int k = Integer.parseInt(st.nextToken()); 
      arr[i] = k;
      answer[i] = k;
      set.add(k);
    }
    //내림차순으로 정렬후 중복을 제거한 set의 크기-1이 1등보다 작은 수의 개수
    //하나씩 감소시키며 맵에 추가
    //중복일경우 건너뜀
    int rank = set.size()-1;
    Arrays.sort(arr,Collections.reverseOrder());
    for(int i : arr){
      if(map.containsKey(i)){
        continue;
      }
      else{
        map.put(i,rank);
        rank--;
      }
    }
    //입력된값으로 랭크를 얻음
    for(int i : answer){
      sb.append(map.get(i)+" ");
    }


     bw.write(sb.toString());
     bw.flush();
  
  }
}
