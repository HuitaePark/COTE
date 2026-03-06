class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder sb = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        int idx = 0;
        while(idx!=m*t){
            sb.append(Integer.toString(idx,n));
            idx++;
        }
        String s  = sb.toString().toUpperCase();
        
        for(int i=p-1;answer.length()<t;i+=m){
            answer.append(s.charAt(i));
        }

        return answer.toString();
    }
}