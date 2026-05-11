import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        List<String> list = new ArrayList<>();
        Map<String,String> map = new HashMap<>();
        
        for(String s : record){
            String[] str = s.split(" ");
            if(str[0].equals("Enter")){
                map.put(str[1],str[2]);
            }
            else if(str[0].equals("Change")){
                map.put(str[1],str[2]);
            }
        }
        
        for(String s : record){
            String[] str = s.split(" ");
            String current = str[0];
            switch(current){
                case "Enter":
                    list.add(map.get(str[1])+"님이 들어왔습니다.");
                    break;
                case "Leave":
                    list.add(map.get(str[1])+"님이 나갔습니다.");
                    break;
            }
        }
        String[] answer = new String[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}