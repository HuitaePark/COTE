import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] arr = new double[score.length];
        for(int i=0;i<answer.length;i++){
            arr[i] = (double)(score[i][0] + score[i][1])/2;
        }
        Arrays.sort(arr);
        Map<Double,Integer> map = new HashMap<>();
        int rank = 1;
        for(int i=arr.length-1;i>=0;i--){
            if(!map.containsKey(arr[i])) map.put(arr[i],rank);
            rank++;
        }
        for(int i=0;i<score.length;i++){
            answer[i] = map.get((double)(score[i][0] + score[i][1])/2);
        }
        return answer;
    }
}