class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int idx= i; idx<=j;idx++){
            String current = Integer.toString(idx);
            for(int l = 0; l<current.length();l++){
                if(current.charAt(l)==Integer.toString(k).charAt(0)) answer++;
            }
        }
        return answer;
    }
}