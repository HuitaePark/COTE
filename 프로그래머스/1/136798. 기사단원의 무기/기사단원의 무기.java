class Solution {
    public int solution(int number, int limit, int power) {
        int[] arr = new int[number];
        for(int i = 0;i<number;i++){
            int count = 0;
            int current  = i+1;
            for(int j=1;j*j<=current;j++){
                if(j*j==current) count++;
                else if(current%j==0) count+=2;
            }
            arr[i] = count;
        }
        
        int answer = 0;
        for(int i = 0;i<number;i++){
            if(arr[i]>limit) arr[i] = power;
            answer+=arr[i];
        }
        
        return answer;
    }
}