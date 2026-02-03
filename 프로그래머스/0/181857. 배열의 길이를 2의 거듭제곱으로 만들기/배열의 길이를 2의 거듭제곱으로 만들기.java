class Solution {
    public int[] solution(int[] arr) {
        int start = 1;
        while(start<arr.length){
            start*=2;
        }
        int[] answer = new int[start];
        for(int i = 0;i<answer.length;i++){
            if(i>=arr.length) answer[i] = 0;
            else answer[i] = arr[i];
        }
        return answer;
    }
}