import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        Map<String,Integer> runner = new HashMap<>();
        Map<Integer,String> rank = new TreeMap<>();
        for(int i=0;i<players.length;i++){
            runner.put(players[i],i+1);
            rank.put(i+1,players[i]);
        }
        for(int i=0;i<callings.length;i++){
            String current = callings[i];
            int currentRank = runner.get(current);
            String prev = rank.get(currentRank-1);
            runner.put(prev,currentRank);
            runner.put(current,currentRank-1);
            rank.put(currentRank,prev);
            rank.put(currentRank-1,current);
        }
        int idx = 0;
        for(Integer key : rank.keySet()){
            answer[idx] = rank.get(key);
            idx++;
        }
        return answer;
    }
}