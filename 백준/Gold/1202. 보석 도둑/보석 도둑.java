import java.util.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    List<Jewel> list = new ArrayList<>();
    int[] bag = new int[k];
    
    for(int i=0;i<n;i++){
      st = new StringTokenizer(br.readLine());
      list.add(new Jewel(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
    }

    for(int i=0;i<k;i++){
      bag[i] = Integer.parseInt(br.readLine());
    }

    Arrays.sort(bag);
    Collections.sort(list,(a,b)->a.weight-b.weight);

    long sum = 0;
    int index = 0;
    Queue<Jewel> q = new PriorityQueue<>((a,b)->b.value-a.value);
    for(int i=0;i<list.size();){
      if(list.get(i).weight<=bag[index]){
        q.offer(list.get(i));
        i++;
      }
      else if(list.get(i).weight>bag[index]){ // 다음 무게로 올라갔을때
        if(index<bag.length-1) {
          if(!q.isEmpty()) sum += (long)q.poll().value;
          index++;//다음 무게의 가방으로 옮김
        }
        else break; //끝에 도달햇을시 걍 탈출
        if(list.get(i).weight<=bag[index]){
        q.offer(list.get(i));
        i++;
        }
      }
    }
    while(index < bag.length) {
        if(!q.isEmpty()) {
            sum+=(long)q.poll().value;
        }
        index++;
    }
    sb.append(sum);
    bw.write(sb.toString());
    bw.flush();
    bw.close();
    br.close();
  }
  static class Jewel{
    int weight,value;
    public Jewel(int weight,int value){
      this.weight = weight;
      this.value = value;
    }
  }
}
