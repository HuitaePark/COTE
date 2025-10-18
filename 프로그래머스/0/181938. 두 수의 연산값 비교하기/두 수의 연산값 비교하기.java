class Solution {
    public int solution(int a, int b) {
        int plus = Integer.parseInt(Integer.toString(a)+Integer.toString(b));
        int sub = 2*a*b;
        return plus == sub ? plus : (plus > sub ? plus : sub);
    }
}