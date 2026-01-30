class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i =0;i<n;i++){
            answer[i] = " ".repeat(n);
        }
        
        for(int i =0;i<n;i++){
            int s1 = arr1[i];
            int s2 = arr2[i];
            for(int j = n-1;j>=0;j--){
                if(s1%2==1 || s2%2==1){
                    StringBuilder sb = new StringBuilder(answer[i]);
                    sb.setCharAt(j,'#');
                    answer[i] = sb.toString();
                }
                s1/=2;
                s2/=2;
            }
        }
        return answer;
    }
}