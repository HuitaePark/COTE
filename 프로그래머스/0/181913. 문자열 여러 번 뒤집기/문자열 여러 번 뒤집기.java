class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);
        for(int i=0;i<queries.length;i++){
            int start = queries[i][0];
            int end = queries[i][1];
            for(int j=start,k = end;j<k;j++,k--){
                char ch = sb.charAt(j);
                sb.setCharAt(j,sb.charAt(k));
                sb.setCharAt(k,ch);
            }
        }
        return sb.toString();
    }
}