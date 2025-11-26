import java.util.*;
import java.util.stream.*;
import java.io.*;
  
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    List<Double> list = new ArrayList<>();

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      list.add(Double.parseDouble(st.nextToken()));
    }

    double max = Collections.max(list);
    double sum = list.stream()
              .mapToDouble(i -> i / max * 100)
              .sum();

    sb.append(sum/n);

    bw.write(sb.toString());
    bw.flush();
  
  }
}
