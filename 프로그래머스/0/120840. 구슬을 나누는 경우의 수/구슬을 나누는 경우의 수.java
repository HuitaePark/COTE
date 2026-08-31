import java.math.*;

class Solution {
    public int solution(int balls, int share) {
        BigInteger[] arr = new BigInteger[balls + 1];

        arr[0] = BigInteger.ONE;

        for (int i = 1; i <= balls; i++) {
            arr[i] = arr[i - 1].multiply(BigInteger.valueOf(i));
        }

        BigInteger result = arr[balls].divide(
            arr[balls - share].multiply(arr[share])
        );

        return result.intValue();
    }
}