class Solution {
    public String solution(String my_string, int s, int e) {
       char[] ch = my_string.toCharArray();
        while(s<e){
            char temp = ch[s];
            ch[s] = ch[e];
            ch[e] = temp;
            s++;
            e--;
        }
        
        return String.valueOf(ch);
    }
}