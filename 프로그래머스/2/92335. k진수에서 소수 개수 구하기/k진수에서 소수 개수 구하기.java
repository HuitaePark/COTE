class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            sb.append(n % k);
            n /= k;
        }

        String[] arr = sb.reverse().toString().split("0");

        for (String s : arr) {
            if (s.isEmpty()) continue;

            long num = Long.parseLong(s);

            if (isPrime(num)) {
                answer++;
            }
        }

        return answer;
    }

    boolean isPrime(long n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (long i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}