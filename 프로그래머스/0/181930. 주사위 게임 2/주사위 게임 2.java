class Solution {
    public int solution(int a, int b, int c) {
        return a != b && b!=c && a!=c ? a+b+c : 
        a==b && b==c ? (a+b+c)*(int)(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2))*(int)(Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3)) : (a+b+c)*(int)(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2));
    }
}