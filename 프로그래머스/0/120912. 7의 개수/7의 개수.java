class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i=0;i<array.length;i++){
            String current = Integer.toString(array[i]);
            for(int j = 0;j<current.length();j++){
                if(current.charAt(j)=='7') answer++;
            }                                 
        }
        return answer;
    }
}