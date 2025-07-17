import java.util.*;
import java.io.*;
  
public class Main{
    
  private static int calculateDistance(int[] p1, int[] p2) {
        return Math.abs(p1[0] - p2[0]) + Math.abs(p1[1] - p2[1]);
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        
   
        int[][] checkPoint = new int[n][2];
        

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            checkPoint[i][0] = Integer.parseInt(st.nextToken());
            checkPoint[i][1] = Integer.parseInt(st.nextToken());
        }
        
        // 어떤 체크포인트도 건너뛰지 않았을 때의 총 거리
        int totalDistance = 0;
        for (int i = 1; i < n; i++) {
            totalDistance += calculateDistance(checkPoint[i-1], checkPoint[i]);
        }
        

        int maxSaving = 0;
        
        // 2번째부터 (N-1)번째 체크포인트까지 순회하며 건너뛸 경우
        // (인덱스로는 1부터 n-2까지)
        for (int i = 1; i < n - 1; i++) {
            // i-1 -> i -> i+1 로 가는 원래 경로의 거리
            int originalPathDistance = calculateDistance(checkPoint[i-1], checkPoint[i]) + calculateDistance(checkPoint[i], checkPoint[i+1]);
            
            // i를 건너뛰고 i-1 -> i+1 로 바로 가는 경로의 거리
            int skippedPathDistance = calculateDistance(checkPoint[i-1], checkPoint[i+1]);
            
       
            int currentSaving = originalPathDistance - skippedPathDistance;
            
            // 가장 많이 절약되는 거리를 갱신
            if (currentSaving > maxSaving) {
                maxSaving = currentSaving;
            }
        }
        
        // 최종 결과는 (총 거리 - 가장 많이 절약되는 거리) 
        int finalDistance = totalDistance - maxSaving;

        sb.append(finalDistance);
        
        bw.write(sb.toString());
        bw.flush();
  
  }
}
