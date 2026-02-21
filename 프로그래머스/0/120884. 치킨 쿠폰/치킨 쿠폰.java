class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken;
        int buyChicken = 0;
        
        while(coupon>=10){
            int current = coupon/10;
            answer+=current;
            
            coupon-=current*10;
            buyChicken = current;
            coupon+=buyChicken;
            
        }
        return answer;
    }
}
