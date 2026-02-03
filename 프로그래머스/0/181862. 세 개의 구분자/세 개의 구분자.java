class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replace("a"," ");
        myStr = myStr.replace("b"," ");
        myStr = myStr.replace("c"," ");
        String[] answer = myStr.trim().split("\\s+");
        if(answer[0].isEmpty()) answer[0] = "EMPTY";
        return answer;
    }
}