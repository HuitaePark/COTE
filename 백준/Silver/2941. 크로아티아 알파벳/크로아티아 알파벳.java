import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length()) {
                // dz= 특수 문자 조합 체크
                if (i + 2 < str.length() &&
                        str.startsWith("dz=", i)) {
                    i += 2;
                    count++;
                    continue;
                }
                
                // 다른 특수 문자 조합들 체크
                String[] specials = {"c=", "c-", "d-", "lj", "nj", "s=", "z="};
                boolean isSpecial = false;
                
                for (String special : specials) {
                    if (str.startsWith(special, i)) {
                        i += 1;
                        count++;
                        isSpecial = true;
                        break;
                    }
                }
                
                if (isSpecial) {
                    continue;
                }
            }
            count++;
        }
        System.out.println(count);
    }
}