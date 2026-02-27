class Solution {
    public int solution(int n, int w, int num) {
        int size = 0;
        int answer = 0;
        if(n%w!=0) size = n/w+1;
        else size =  n/w;
        int[][] arr = new int[size][w];
        int counter = 0;
        int sum = 1;
        for(int i=0;i<size;i++){
            if(counter%2==0){
                for(int j=0;j<w;j++){
                    if(sum<=n) arr[i][j] = sum;
                    sum++;
                }
            }
            else{
                for(int j=w-1;j>=0;j--){
                    if(sum<=n) arr[i][j] = sum;
                    sum++;
                }
             }
            counter++;
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<w;j++){
                if(arr[i][j]==num){
                   for(int k=size-1;k>=i;k--){
                       if(arr[k][j]!=0) answer++;
                   }
                }
            }
        }
        
        return answer;
    }
}