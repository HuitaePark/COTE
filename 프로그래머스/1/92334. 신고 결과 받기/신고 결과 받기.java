import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        //유저 신고 내역
        Map<String,Set<String>> map = new HashMap<>();
        //신고당한 횟수 정산
        Map<String,Integer> reported = new HashMap<>(); 
        
        for(int i=0;i<id_list.length;i++){
            map.put(id_list[i],new HashSet<>());        
        }
        
        //신고 내역 저장
        for(int i=0;i<report.length;i++){
            String[] str = report[i].split(" ");
            map.get(str[0]).add(str[1]);
        }
        
        //신고횟수 세기
        for(String s : map.keySet()){
            for(String id : map.get(s)){
                reported.put(id,reported.getOrDefault(id,0)+1);
            }    
        }
        
        //정산
        for(int i=0;i<answer.length;i++){
            String current = id_list[i];
            for(String s : map.get(current)){
                if(reported.get(s)>=k) answer[i]++;
            }
        }
        
        return answer;
    }
}