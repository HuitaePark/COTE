class Solution {
    public int solution(int order) {
        int answer = 0;
        String game = Integer.toString(order);
        for(int i = 0;i<game.length();i++){
            if(game.charAt(i)=='3' || game.charAt(i)=='6' || game.charAt(i)=='9') answer++;
        }
        return answer;
    }
}