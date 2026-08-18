class Solution {
    public String longestCommonPrefix(String[] strs) {
        Map<String, Integer> map = new HashMap<>();

        for (String current : strs) {
            for (int j = 1; j <= current.length(); j++) {
                String prefix = current.substring(0, j);
                map.put(prefix, map.getOrDefault(prefix, 0) + 1);
            }
        }

        String answer = "";

        for (String prefix : map.keySet()) {
            if (map.get(prefix) == strs.length &&
                prefix.length() > answer.length()) {
                answer = prefix;
            }
        }

        return answer;
    }
}