class Solution {
    public String solution(String s, String skip, int index) {
        char[] ch = s.toCharArray();
        
        for (int i = 0; i < ch.length; i++) {
            char current = ch[i];

            for (int j = 0; j < index; j++) {
                current++;
                if (current > 'z') current = 'a';

                while (skip.contains(String.valueOf(current))) {
                    current++;
                    if (current > 'z') current = 'a';
                }
            }
            
            ch[i] = current;    
        }
        
        return String.valueOf(ch);
    }
}