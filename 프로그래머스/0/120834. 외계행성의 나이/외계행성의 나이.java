import java.util.*;
class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        String s = Integer.toString(age);
        
        for(int i=0;i<s.length();i++){
            int c = Character.getNumericValue(s.charAt(i)); 
            sb.append((char)('a'+c));
        }
        
        return sb.toString();
    }
}