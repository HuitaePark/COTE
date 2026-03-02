import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String,Set<String>> map  = new HashMap<>();
        Map<String,Integer> reported = new HashMap<>();
        //맵 초기화
        for(int i=0;i<id_list.length;i++){
            map.put(id_list[i],new HashSet<>());
            reported.put(id_list[i],0);
        }
        //신고하기
        for(int i=0;i<report.length;i++){
            String[] str = report[i].split(" ");
            String current = str[0];
            Set<String> currentSet = map.get(current);
            currentSet.add(str[1]);
            map.put(current,currentSet);
        }
        
        //신고당한 횟수 계산
        for(Map.Entry<String,Set<String>> entry : map.entrySet()){
            Set<String> currentSet = entry.getValue();
            for(String s:currentSet){
                reported.put(s,reported.get(s)+1);
            }   
        }
        
        int[] answer = new int[id_list.length];
        for(int i=0;i<answer.length;i++){
            String current = id_list[i];
            Set<String> currentSet = map.get(current);
            for(String s:currentSet){
                if(reported.get(s)>=k) answer[i]++;
            }
        }
            return answer;
        }
    }