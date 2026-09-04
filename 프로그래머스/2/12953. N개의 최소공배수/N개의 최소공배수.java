class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        answer = arr[0] * arr[1] / gcd(arr[0],arr[1]);
        for(int i=2;i<arr.length;i++){
            answer = answer * arr[i]/gcd(answer,arr[i]);
        }
        return answer;
    }
    int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}