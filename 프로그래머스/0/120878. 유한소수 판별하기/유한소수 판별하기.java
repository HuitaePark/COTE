import java.math.*;
class Solution {
    public int solution(int a, int b) {
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        BigInteger gcd = b1.gcd(b2);
        b /=gcd.intValue();
        while(b%2==0) b/=2;
        while(b%5==0) b/=5;
        return b==1 ? 1 :2;
    }
}