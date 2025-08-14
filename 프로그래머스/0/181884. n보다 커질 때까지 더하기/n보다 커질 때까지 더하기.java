class Solution {
    public int solution(int[] numbers, int n) {
        int sum =0;
        int num = 0;
        while(sum<=n){
            sum+=numbers[num];
            num++;
        }
        return sum;
    }
}