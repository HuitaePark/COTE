import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[26];
        for(int i =0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i = 0;i<26;i++){
            if(arr[i]==1){
                sb.append((char)(i+'a'));
            }
        }
        return sb.toString();
    }
}