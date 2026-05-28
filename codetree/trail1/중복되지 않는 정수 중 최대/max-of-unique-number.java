import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        Map<Integer,Integer> map = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            int current = Integer.parseInt(st.nextToken());
            arr[i] = current;
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        Arrays.sort(arr);

        for(int i = n-1;i>=0;i--){
            if(map.get(arr[i])>1) continue;
            else {
                sb.append(arr[i]);
                break;
            }
        }
        if(sb.length()==0) sb.append(-1);
        System.out.print(sb);
    }
}