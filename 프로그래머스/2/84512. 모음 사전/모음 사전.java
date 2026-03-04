class Solution {
    public int solution(String word) {
        int answer = 0;
        char[] ch = {'A', 'E', 'I', 'O', 'U'};
        
        int[] weight = new int[5];
        int val = 1;
        for (int i = 4; i >= 0; i--) {
            weight[i] = val;
            val = val + (int) Math.pow(5, 5 - i); 
        }
        for (int i = 0; i < word.length(); i++) {
            int idx = 0;
            for (int j = 0; j < ch.length; j++) {
                if (word.charAt(i) == ch[j]) {
                    idx = j;
                    break;
                }
            }
            answer += (idx * weight[i]) + 1;
        }
        
        return answer;
    }
}