import java.util.*;
import java.util.stream.*;
class Solution {
    public List<Integer> solution(int[] answers) {
        int[][] pattern = {
            {1,2,3,4,5},
            {2,1,2,3,2,4,2,5},
            {3,3,1,1,2,2,4,4,5,5}
        };
        int[] score = new int[3];
        
        for(int i = 0;i<answers.length;i++){
            for(int j =0;j<pattern.length;j++){
                if(answers[i]==pattern[j][i%pattern[j].length]){
                    score[j]++;
                }
            }
        }
        
        int max = Arrays.stream(score).max().getAsInt();
        List<Integer> answer = new ArrayList<>();
        for(int i = 0;i<3;i++){
            if(score[i] == max){
                answer.add(i+1);
            }
        }
        return answer;
    }
}