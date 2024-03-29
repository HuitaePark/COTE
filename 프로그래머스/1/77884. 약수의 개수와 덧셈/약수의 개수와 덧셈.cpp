int divisor_count(int& value) {
    int count = 0;
    for (int i = 1; i <= value; ++i)
        if (value % i == 0)
            ++count;
    return count;
}
int solution(int left, int right) {
    int ans = 0;
    for (int i = left; i <= right; ++i)
        if (divisor_count(i) & 1)           // 홀수
            ans -= i;
        else                                // 짝구
            ans += i;
    return ans;
}
