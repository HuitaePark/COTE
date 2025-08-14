class Solution {
    public int solution(int n) {
        return Double.toString(Math.sqrt(n)).contains(".0") ? 1 : 2;
    }
}