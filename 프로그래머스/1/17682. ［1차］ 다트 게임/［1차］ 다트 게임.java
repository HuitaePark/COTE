class Solution {
    public int solution(String dartResult) {
        int[] scores = new int[3];
        int idx = 0;               
        String temp = "";          
        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            if (c >= '0' && c <= '9') {
                temp += String.valueOf(c);
            } 
            else if (c == 'S' || c == 'D' || c == 'T') {
                int score = Integer.parseInt(temp);
                
                if (c == 'S') {
                    scores[idx] = (int) Math.pow(score, 1);
                } else if (c == 'D') {
                    scores[idx] = (int) Math.pow(score, 2);
                } else if (c == 'T') {
                    scores[idx] = (int) Math.pow(score, 3);
                }
                
                idx++; 
                temp = "";  
            } 
            else if (c == '*' || c == '#') {
                if (c == '*') {
                    scores[idx - 1] *= 2; 
                    
                    if (idx - 1 > 0) {
                        scores[idx - 2] *= 2; 
                    }
                } else if (c == '#') {
                    scores[idx - 1] *= -1; 
                }
            }
        }

        return scores[0] + scores[1] + scores[2];
    }
}