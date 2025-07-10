import java.util.*;
import java.io.*;
  
public class Main{
  static int[] parent;
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int m = Integer.parseInt(br.readLine());
    
     parent = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }
    
    for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            union(a, b); 
        }
    
    int count = 0;
    int rootOfOne = find(1);

    for (int i = 2; i <= n; i++) {
            // 해당 노드의 루트가 1번 노드의 루트와 같다면, 연결된 것임
            if (find(i) == rootOfOne) {
                count++;
            }
        }

    sb.append(count);

     bw.write(sb.toString());
     bw.flush();
  
  }
   private static int find(int x) {
        if (parent[x] == x) {
            return x;
        }
        // 경로 압축: 재귀적으로 루트를 찾고, 자신의 부모를 루트로 직접 연결
        return parent[x] = find(parent[x]);
    }
     private static void union(int a, int b) {
        // 각 원소의 루트 노드를 찾음
        int rootA = find(a);
        int rootB = find(b);

        // 두 루트가 다를 경우에만 합침
        if (rootA != rootB) {
            // 일반적으로 더 작은 번호의 루트를 부모로 삼음
            if (rootA < rootB) {
                parent[rootB] = rootA;
            } else {
                parent[rootA] = rootB;
            }
        }
    }
}
