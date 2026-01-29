import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        Queue<String> q1 = new ArrayDeque<>();
        Queue<String> q2 = new ArrayDeque<>();
        for(int i =0;i<cards1.length;i++){
            q1.offer(cards1[i]);
        }
        for(int i =0;i<cards2.length;i++){
            q2.offer(cards2[i]);
        }
        for(int i =0;i<goal.length;i++){
            if(!q1.isEmpty()&&q1.peek().equals(goal[i])) q1.poll();
            else if(!q2.isEmpty()&&q2.peek().equals(goal[i])) q2.poll();
            else return "No";
        }
        
        return "Yes";
    }
}