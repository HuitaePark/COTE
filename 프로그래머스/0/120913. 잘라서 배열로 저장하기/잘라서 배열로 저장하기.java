class Solution {
    public String[] solution(String my_str, int n) {
        int length = 0;
        if(my_str.length()%n==0) length = my_str.length()/n;
        else length = my_str.length()/n+1;
        
        String[] answer = new String[length];
        int counter = 0;
        for(int i=0;i<answer.length;i++){
            int temp = counter;
            StringBuilder sb = new StringBuilder();
            for(int j=temp;j<temp+n;j++){
                if(j>=my_str.length()) break;
                sb.append(my_str.charAt(j));
                counter++;
            }
            answer[i] = sb.toString();
        }
        return answer;
    }
}