import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Set<String> cache = new HashSet<>();
        Queue<String> q = new ArrayDeque<>();
        if(cacheSize==0) return cities.length*5;
        
        for(int i=0;i<cities.length;i++){
            String current = cities[i].toLowerCase();
            if(!cache.contains(current)){
                cache.add(current);
                q.offer(current);
                answer+=5;
            }
            else{
                answer+=1;
                q.remove(current);
                q.offer(current);
            }
            if(q.size()>cacheSize){
                cache.remove(q.poll());
            }
        }
        
        return answer;
    }
}