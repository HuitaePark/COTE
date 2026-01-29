class Solution {
    public int solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i =0;i<s.length();i++){
            char current = s.charAt(i);
            if('0'<=current && current<='9'){
                sb.append(current);
            }
            else{
                for(int j=0;j<arr.length;j++){
                    if(s.startsWith(arr[j],i)){
                        sb.append(j);
                        break;
                    }
                }
            }
        }
        return Integer.parseInt(sb.toString());
    }
}