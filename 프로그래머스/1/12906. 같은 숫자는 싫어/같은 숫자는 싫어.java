import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int count = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(arr[0]); 
        for(int i=1;i<arr.length;i++){
           if(arr[i-1]==arr[i]){
               continue;
           }
            q.add(arr[i]);    

        }
        int[] answer = new int[q.size()];
        int size = q.size();
        for(int i = 0;i<size;i++){
            answer[i] = q.poll();
        }
        return answer;
    }
}