import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList();
        
        for(int i = 0;i<numbers.length;i++){
            for(int j = 0;j<numbers.length;j++){
                if(i==j){
                    continue;
                }
                int sum = numbers[i]+numbers[j];
                if(!list.contains(sum)){
                    list.add(sum);
                }
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}