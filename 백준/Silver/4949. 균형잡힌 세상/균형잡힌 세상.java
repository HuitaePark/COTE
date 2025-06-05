import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    while (true) {
      String st = br.readLine();
      if (st.equals(".")) break;

      Stack<Character> stack = new Stack<>();
      boolean balanced = true;

      for (int i = 0; i < st.length(); i++) {
        char ch = st.charAt(i);
        if (ch == '(' || ch == '[') {
          stack.push(ch);
        } else if (ch == ')') {
          if (stack.isEmpty() || stack.peek() != '(') {
            balanced = false;
            break;
          }
          stack.pop();
        } else if (ch == ']') {
          if (stack.isEmpty() || stack.peek() != '[') {
            balanced = false;
            break;
          }
          stack.pop();
        }
      }

      if (balanced && stack.isEmpty()) {
        sb.append("yes\n");
      } else {
        sb.append("no\n");
      }
    }

    bw.write(sb.toString());
    bw.flush();
  }
}
