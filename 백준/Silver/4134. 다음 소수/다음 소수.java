import java.io.*;

public class Main {
  
  // 소수 판별 함수
  private static boolean isPrime(long num) {
    if (num <= 1) return false;  // 1은 소수가 아님
    if (num == 2 || num == 3) return true;  // 2와 3은 소수
    if (num % 2 == 0 || num % 3 == 0) return false;  // 2와 3의 배수는 소수가 아님
    // 6k ± 1 형태의 수만 확인 (3 이후부터)
    for (long i = 5; i * i <= num; i += 6) {
      if (num % i == 0 || num % (i + 2) == 0) {
        return false;
      }
    }
    return true;  // 소수
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int t = Integer.parseInt(br.readLine());  // 테스트 케이스 개수
    while (t-- > 0) {
      long n = Long.parseLong(br.readLine());  // 각 테스트 케이스의 n 값
      while (!isPrime(n)) {
        n++;  // n이 소수가 아니면 n을 1씩 증가시켜서 소수 찾기
      }
      bw.write(n + "\n");  // 찾은 소수를 출력
    }

    bw.flush();  // 출력 버퍼 비우기
  }
}