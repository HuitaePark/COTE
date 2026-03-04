import java.util.*;
class Solution {
    public int[] solution(String s) {
        Map<Integer,Integer> map = new HashMap<>();        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();){
            char ch = s.charAt(i);
            if(ch>='0' && s.charAt(i)<='9'){
                sb.append(ch);
                i++;
            }
            else if(sb.length()>0){
                String current = sb.toString();
                int temp = Integer.parseInt(current);
                map.put(temp,map.getOrDefault(temp,0)+1);
                i++;
                sb.setLength(0);
            }
            else{
                i++;
            }
        }
        
        List<Integer> list = new ArrayList<>();
        for(Integer i : map.keySet()){
            list.add(i);
        }
        
        Collections.sort(list, (a,b) -> map.get(b) - map.get(a));
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}