import java.util.*;
import java.util.stream.*;
class Solution {
    public String[] solution(String[] names) {
        List<String> list = new ArrayList<>();
        int index = 0;
        
        while(index<=names.length-1){
          if(index%5==0){
              list.add(names[index]);
          }
            index++;
        }
        
        return list.stream().toArray(String[]::new);
    }
}