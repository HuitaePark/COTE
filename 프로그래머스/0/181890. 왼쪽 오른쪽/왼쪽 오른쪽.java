import java.util.*;
class Solution {
    public List<String> solution(String[] str_list) {
        List<String> list = new ArrayList<>();
        if(str_list[0].equals("l")) return list;
        if(str_list.length==1) return list;
        for(int i=0;i<str_list.length;i++){
            boolean isExist = false;
            if(str_list[i].equals("l")){
                for(int j=0;j<i;j++){
                    list.add(str_list[j]);
                }
                isExist = true;
                break;
            }
            else if(str_list[i].equals("r")){
                for(int j=i+1;j<str_list.length;j++){
                    list.add(str_list[j]);
                }
                isExist = true;
                break;
            }
            if(isExist) break;
        }
        
        return list;
    }
}