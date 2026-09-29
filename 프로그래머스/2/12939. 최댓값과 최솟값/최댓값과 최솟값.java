class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] str = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<str.length;i++){
            int current = Integer.parseInt(str[i]);
            max = Math.max(current,max);
            min = Math.min(current,min);
        }
        return sb.append(min+" "+max).toString();
    }
}