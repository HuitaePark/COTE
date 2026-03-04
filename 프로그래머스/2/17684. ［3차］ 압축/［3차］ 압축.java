import java.util.*;
class Solution {
    public int[] solution(String msg) {
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<26;i++){
            map.put(String.valueOf((char)('A'+i)),i+1);  
        }
        List<Integer> list = new ArrayList<>();
        String current = msg;
        while(current.length()!=0){
            String tmp;
            int prev = 0;
            for(int i=1;i<=current.length();){
               tmp = current.substring(0,i);
               if(map.containsKey(tmp)){
                    prev = map.get(tmp);
                    i++;
                    if(i>current.length()){
                        list.add(prev);
                        current="";
                        break;
                    }
               }
               else{
                   map.put(tmp,map.size()+1);
                   list.add(prev);
                   
                   current = current.substring(i-1);
                   break;
                }
            }
        }
        
    
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}