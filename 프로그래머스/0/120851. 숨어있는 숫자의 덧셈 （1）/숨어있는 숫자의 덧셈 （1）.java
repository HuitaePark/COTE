class Solution {
    public int solution(String my_string) {
        int answer = 0;

        for(int i=0;i<my_string.length();i++){
            int current = my_string.charAt(i);
            if(current>=48&&current<=57){
                answer+= Character.getNumericValue(my_string.charAt(i));

            }
        }
        return answer;
    }
}