import java.util.*;
import java.io.*;
  
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        long count = 0; // int 범위를 넘어갈 수 있으므로 long으로 선언

        for (int i = 0; i < n; i++) {
            int currentHeight = Integer.parseInt(br.readLine());

            // 스택의 top에 있는 빌딩이 현재 빌딩보다 낮거나 같으면 pop
            // 이 빌딩들은 현재 빌딩에 막혀 더 이상 오른쪽을 볼 수 없다.
            while (!stack.isEmpty() && stack.peek() <= currentHeight) {
                stack.pop();
            }

            // while문 종료 후 스택에 남아있는 빌딩들은
            // 현재 빌딩을 볼 수 있는 왼쪽에 있는 빌딩들이다.
            // 그 개수만큼 count를 더한다.
            count += stack.size();

            // 현재 빌딩을 스택에 추가한다.
            stack.push(currentHeight);
        }

     

     sb.append(count);
     bw.write(sb.toString());
     bw.flush();
  
  }
}
