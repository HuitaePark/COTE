class Solution {
    public int solution(String s) {
        int answer = 0;
        int different = 0;
        int origin = 0;
        boolean isStart = false;
        char ch = '!';
        for(int i = 0;i<s.length();i++){
            if(!isStart){
                isStart = true;
                ch = s.charAt(i);
                origin++;
                continue;
            }
            if(isStart){
                if(s.charAt(i)==ch) origin++;
                else different++;
            }
            if(different==origin){
                answer++;
                different = 0;
                origin = 0;
                isStart= false;
            }
        }
        if(origin!=0 || different!=0) answer++;
        return answer;
    }
}