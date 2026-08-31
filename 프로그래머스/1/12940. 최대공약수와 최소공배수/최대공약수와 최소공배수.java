class Solution {
    public int[] solution(int n, int m) {
        return new int[]{gcd(n,m),n*m/gcd(n,m)};
    }
    int gcd(int a, int b){
        int tmp,k;
        
        if(b>a){
            tmp = b;
            b = a;
            a = tmp;
        }
        
        while(b!=0){
            k = a%b;
            a = b;
            b = k;
        }
        return a;
    }
}