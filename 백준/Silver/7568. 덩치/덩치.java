import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];

        String[] sp;
        for(int i = 0; i < N; i++) {
            sp = br.readLine().split(" ");			// 문자열 분리
            arr[i][0] = Integer.parseInt(sp[0]);	// [i][0] : 몸무게 
            arr[i][1] = Integer.parseInt(sp[1]);	// [i][1] : 키 
        }

        for(int i=0;i<N;i++){
            int rank = 1;

            for(int j = 0; j < N; j++) {
                if(i == j) continue;
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    rank++;
                }
            }
            bw.write(rank+" ");
        }
        bw.flush();
    }
}