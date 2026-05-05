import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        Set<String> set = new HashSet<>();
        for(int i=0;i<phone_book.length;i++){
            set.add(phone_book[i]);
        }
        for(String s : phone_book){
            for(int i=1;i<s.length();i++){
                String current = s.substring(0,i);
                if(set.contains(current)) return false;
            }
        }
        return true;
    }
}