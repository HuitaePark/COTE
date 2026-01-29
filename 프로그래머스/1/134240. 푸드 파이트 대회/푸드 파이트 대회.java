class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<food.length;i++) {
            if(food[i]<2) continue;
            for(int j =0;j<food[i]/2;j++){
                sb.append(i);
            }
        }
        sb.append(0);
        sb.append(new StringBuilder(sb).reverse());
        sb.deleteCharAt(sb.length()/2);
        return sb.toString();
    }
}