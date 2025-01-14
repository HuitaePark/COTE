import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 효율적으로 읽어오기 위해 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder는 결과를 빠르게 저장하고 출력하기 위해 사용
        StringBuilder sb = new StringBuilder();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        
        h = h + (m+c)/60;
        m = (m+c)%60; 
        
        if(h >=24){
            h -=24;
        }
        sb.append(h).append(" ").append(m);
         
        System.out.print(sb);
    
    }
}