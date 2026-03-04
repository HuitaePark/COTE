import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        Set<String> set = new HashSet<>();
        for(int i=0;i<phone_book.length;i++){
            set.add(phone_book[i]);
        }
        for(int i=0;i<phone_book.length;i++){
            String current = phone_book[i];
            for(int j=1;j<current.length();j++){
                String sub = current.substring(0,j);
                if(set.contains(sub)) return false;
            }
        }
        
        return true;
    }
}