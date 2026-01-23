class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long pv = Long.parseLong(p);
        for (int i = 0; i <= t.length() - p.length(); i++) {
            long cur = Long.parseLong(t.substring(i, i + p.length()));
            if (cur <= pv) answer++;
        }
        return answer;
    }
}