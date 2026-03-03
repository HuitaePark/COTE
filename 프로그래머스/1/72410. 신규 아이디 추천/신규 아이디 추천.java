class Solution {
    public String solution(String new_id) {
        StringBuilder sb = new StringBuilder(new_id);

        // 1단계
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (c >= 'A' && c <= 'Z') sb.setCharAt(i, (char)(c - 'A' + 'a'));
        }

        // 2단계
        for (int i = sb.length() - 1; i >= 0; i--) {
            char c = sb.charAt(i);
            boolean ok = c == '-' || c == '_' || c == '.'
                    || (c >= 'a' && c <= 'z')
                    || (c >= '0' && c <= '9');
            if (!ok) sb.deleteCharAt(i);
        }

        // 3단계 (연속 '.' 압축)
        for (int i = 1; i < sb.length(); ) {
            if (sb.charAt(i) == '.' && sb.charAt(i - 1) == '.') sb.deleteCharAt(i);
            else i++;
        }

        // 4단계
        if (sb.length() > 0 && sb.charAt(0) == '.') sb.deleteCharAt(0);
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '.') sb.deleteCharAt(sb.length() - 1);

        // 5단계
        if (sb.length() == 0) sb.append('a');

        // 6단계
        if (sb.length() > 15) sb.setLength(15);
        if (sb.length() > 0 && sb.charAt(0) == '.') sb.deleteCharAt(0);
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '.') sb.deleteCharAt(sb.length() - 1);

        // 7단계
        while (sb.length() <= 2) sb.append(sb.charAt(sb.length() - 1));

        return sb.toString();
    }
}