class Solution {
    public int[] solution(String my_string) {
        int[] lower = new int[26];
        int[] upper = new int[26];
        int[] answer = new int[52];
        for(int i=0;i<my_string.length();i++){
            char current = my_string.charAt(i);                
            if(current<='z'&& 'a'<=current){
                lower[current-'a']++;
            }
            else{
                upper[current-'A']++;
            }
        }
        for(int i=0;i<26;i++){
            answer[i] = upper[i];
        }
        for(int i=26;i<52;i++){
            answer[i] = lower[i-26];
        }
        return answer;
    }
}