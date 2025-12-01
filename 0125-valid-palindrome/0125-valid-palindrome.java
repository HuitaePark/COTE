import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
        String ss = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        String reversed = new StringBuilder(ss).reverse().toString();
        return ss.equals(reversed) ? true : false;
    }
}