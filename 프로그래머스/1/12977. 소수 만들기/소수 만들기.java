class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                for(int k =j+1;k<nums.length;k++){
                    if(isPrime(nums[i]+nums[j]+nums[k])){
                        answer++;
                    }
                }
            }
        }
            
        return answer;
    }
    boolean isPrime(int n){
        if(n<=1) return false; 
        if(n==2) return true;
        if(n%2==0) return false;
        
        for(int i=3;i*i<=n;i+=2){
            if(n%i==0) return false;
        }
        
        return true;
    }
}