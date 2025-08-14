class Solution {
    public int solution(String str1, String str2) {
        
        char[] arr = str2.toCharArray();
        boolean isMatching = false;
        
        for(int i = 0;i<str1.length();i++){
            if(str1.charAt(i)==str2.charAt(0) && i + str2.length()<=str1.length()){
                String str = str1.substring(i, i + str2.length());
                if(str.equals(str2)) isMatching = true;
            }
        }
        
        
        if(isMatching) return 1;
        
        return 2;
    }
}