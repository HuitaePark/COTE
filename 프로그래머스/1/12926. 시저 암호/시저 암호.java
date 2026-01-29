class Solution {
    public String solution(String s, int n) {
        char[] ch = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                ch[i] = ' ';
                continue;
            }

            if (c >= 'a' && c <= 'z') {
                char shifted = (char)(c + n);
                if (shifted > 'z') shifted = (char)(shifted - 26);
                ch[i] = shifted;
            } else if (c >= 'A' && c <= 'Z') {
                char shifted = (char)(c + n);
                if (shifted > 'Z') shifted = (char)(shifted - 26);
                ch[i] = shifted;
            }
        }

        return String.valueOf(ch);
    }
}