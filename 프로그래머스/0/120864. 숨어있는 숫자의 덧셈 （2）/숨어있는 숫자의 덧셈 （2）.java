class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] parts = my_string.replaceAll("[A-Za-z]+", " ").trim().split("\\s+");
        for(String s : parts){
            if(!s.isEmpty())
            answer+=Integer.parseInt(s);
        }
        return answer;
    }
}