import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String,Integer> cnt = new HashMap<>();
        Map<Integer,String> idx = new HashMap<>();
        
        /*
        장르의 재생횟수를 더함
        인덱스별 장르를 저장
        */
        for(int i=0;i<genres.length;i++){
            cnt.put(genres[i],cnt.getOrDefault(genres[i],0)+plays[i]);
            idx.put(i,genres[i]);
        }
        
        //조건대로 정렬하는 
        List<Integer> list = new ArrayList<>();
        
        for(int i=0;i<plays.length;i++){
            list.add(i);
        }
        Collections.sort(list,(a,b)->{
            if(cnt.get(idx.get(a))!=cnt.get(idx.get(b))) 
                return cnt.get(idx.get(b))-cnt.get(idx.get(a));
            if(plays[a]!=plays[b]) 
                return plays[b]-plays[a];
            return a-b;
        });
        
        List<Integer> answerList = new ArrayList<>();
        Map<String,Integer> count = new HashMap<>();
        
        for(String s : cnt.keySet()){
            count.put(s,0);
        }
        
        //두개씩 모아 삽입
        int answerIdx = 0;
        for(int i=0;i<list.size();i++){
            int current = list.get(i);
            if(count.get(genres[current])<2){
                answerList.add(current);
                count.put(genres[current],count.get(genres[current])+1);
            }
        }
        
        return answerList.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}