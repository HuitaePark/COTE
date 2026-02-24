class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] arr = new int[201];
        for(int i=0;i<lines.length;i++){
            int start = lines[i][0];
            int end = lines[i][1];
            for(int j=start;j<end;j++){
                if(i>=0){
                    arr[100+j]++;
                }
                else{
                    arr[100-j]++;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>1) answer++;
        }
        return answer;
    }
}