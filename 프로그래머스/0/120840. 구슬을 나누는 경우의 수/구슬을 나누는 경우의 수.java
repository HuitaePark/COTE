import java.math.BigInteger;

class Solution {
    public long solution(int balls, int share) {
        BigInteger nFact = fact(balls);
        BigInteger kFact = fact(share);
        BigInteger nkFact = fact(balls - share);

        BigInteger comb = nFact.divide(kFact.multiply(nkFact));
        return comb.longValue();
    }

    private BigInteger fact(int x) {
        BigInteger r = BigInteger.ONE;
        for (int i = 2; i <= x; i++) {
            r = r.multiply(BigInteger.valueOf(i));
        }
        return r;
    }
}
