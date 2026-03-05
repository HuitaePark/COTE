import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        List<Integer> answer = new ArrayList<>();
        for(int i=0;i<genres.length;i++){
            answer.add(i);
        }
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<plays.length;i++){
            map.put(genres[i],map.getOrDefault(genres[i],0)+plays[i]);
        }
        Collections.sort(answer,(a,b)->{
            int g = map.get(genres[b])-map.get(genres[a]); //장르 앨범의 총합
            if(g!=0) return g;
            
            int p = plays[b] - plays[a]; // 각자 판매량
            if(p != 0) return p;
            
            return a-b; // 인덱스 오름차순
        });
        Map<String,Integer> count = new HashMap<>();
        for(String s: map.keySet()){
            count.put(s,0);
        }
        for(int i=0;i<answer.size();i++){
            count.put(genres[answer.get(i)],count.get(genres[answer.get(i)])+1);
        }

        for(int i=answer.size()-1;i>=0;i--){
            String currentGenres =  genres[answer.get(i)];
            if(count.get(currentGenres)>2){
                answer.remove(i);
                count.put(currentGenres,count.get(currentGenres)-1);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}