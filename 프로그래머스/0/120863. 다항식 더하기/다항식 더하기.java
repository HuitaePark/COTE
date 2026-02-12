class Solution {
    public String solution(String polynomial) {
        String[] str = polynomial.split(" \\+ ");
        int xCount = 0;
        int numCount = 0;
        
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("x")) {
                xCount++;
            } else if (str[i].endsWith("x")) {
                xCount += Integer.parseInt(str[i].replace("x", ""));
            } else {
                numCount += Integer.parseInt(str[i]);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        if (xCount > 0) {
            sb.append(xCount == 1 ? "x" : xCount + "x");
        }
        if (numCount > 0) {
            if (sb.length() > 0) {
                sb.append(" + ");
            }
            sb.append(numCount);
        }
        if (sb.length() == 0) {
            return "0";
        }
        return sb.toString();
    }
}