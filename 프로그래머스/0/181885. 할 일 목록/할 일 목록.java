import java.util.*;
import java.util.stream.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> todoList = new ArrayList<>();
        for(int i = 0;i<todo_list.length;i++){
            if(!finished[i]){
                todoList.add(todo_list[i]);
            }
        }
        return todoList.stream().toArray(String[]::new);
    }
}