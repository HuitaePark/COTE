import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCases = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();

        while(testCases-- > 0) {
            String input = br.readLine();
            LinkedList<Character> list = new LinkedList<>();
            ListIterator<Character> iterator = list.listIterator();
            
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                switch(c) {
                    case '<':
                        if(iterator.hasPrevious()) {
                            iterator.previous();
                        }
                        break;
                    case '>':
                        if(iterator.hasNext()) {
                            iterator.next();
                        }
                        break;
                    case '-':
                        if(iterator.hasPrevious()) {
                            iterator.previous();
                            iterator.remove();
                        }
                        break;
                    default:
                        iterator.add(c);
                        break;
                }
            }
            
            for(char ch : list) {
                bw.write(ch);
               
            }
             bw.write("\n");
        }
        
        bw.flush();
    }
}
