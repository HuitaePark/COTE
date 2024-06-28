class Solution {
    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();
        int arr = code-1;
        for(int i=arr;i<cipher.length();i+=code){
            char current = cipher.charAt(i);
            answer.append(current);
        }
        return answer.toString();
    }
}