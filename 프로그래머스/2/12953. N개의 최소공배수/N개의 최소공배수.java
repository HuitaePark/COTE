import java.math.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        if(arr.length==1) return arr[0];
        
        BigInteger[] array = new BigInteger[arr.length];
        for(int i=0;i<arr.length;i++){
            array[i] = BigInteger.valueOf(arr[i]);
        }
        BigInteger gcd = array[0].gcd(array[1]);
        BigInteger gbd = array[0].multiply(array[1]).divide(gcd);
        if(arr.length==2) return gbd.intValue();
            
        for(int i=2;i<array.length;i++){
            BigInteger current = gbd.gcd(array[i]);
            gbd = gbd.multiply(array[i]).divide(current);
        }
        
        return gbd.intValue();
    }
}