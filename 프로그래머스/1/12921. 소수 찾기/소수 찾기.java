class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i =1;i<=n;i++){
            if(isPrime(i)) answer++;
        }
        return answer;
    }
    boolean isPrime(int n){
        if(n<=1) return false;
        if(n==2 || n==3) return true;
        if(n%2==0 || n%3==0) return false;
        
        for(int i=5;i*i<=n;i+=6){
            if(n%i==0 || n%(i+2) == 0) return false;
        }
        
        return true;
    }
}