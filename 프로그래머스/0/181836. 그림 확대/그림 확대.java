class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        for(int i=0;i<picture.length;i++){
            StringBuilder sb = new StringBuilder();
            String current = picture[i];
            for(int j=0;j<current.length();j++){
                sb.append(String.valueOf(current.charAt(j)).repeat(k));
            }
            String s = sb.toString();
            for(int j=i*k;j<i*k+k;j++){
                answer[j] = s;
            }
        }
        return answer;
    }
}