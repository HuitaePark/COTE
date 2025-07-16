import java.util.*;
import java.io.*;
public class Main{

    static int m;
    static int n;
    static int[][] arr;
    static int[][] visited;

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < num; i++){
            // 각 테스트 케이스마다 count를 초기화
            int count = 0; 
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken()); // m과 n을 정적 변수에 할당
            n = Integer.parseInt(st.nextToken());
            
            arr = new int[m][n]; // 배열도 정적 변수에 할당
            visited = new int[m][n];
            
            int k = Integer.parseInt(st.nextToken());
            
            // 배추가 심어져 있는곳 1로 바꾸기
            for(int j = 0; j < k; j++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                arr[x][y] = 1;
            }

            for(int j = 0; j < m; j++){
                for(int l = 0; l < n; l++){
                    if(arr[j][l] == 1 && visited[j][l] == 0){
                        count++;
                        dfs(j, l); // dfs 호출
                    }
                }
            }
            sb.append(count).append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
    }
    
    private static void dfs(int x, int y){
        // 배열 범위 체크를 먼저 수행
        if(x < 0 || x >= m || y < 0 || y >= n || arr[x][y] == 0 || visited[x][y] == 1){
            return;
        }
        
        visited[x][y] = 1;

        dfs(x + 1, y);
        dfs(x - 1, y);
        dfs(x, y + 1);
        dfs(x, y - 1);
    }
}
