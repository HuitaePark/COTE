import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        for(int i = 0;i<X.length();i++){
            char ch = X.charAt(i);
            arr1[ch-'0']++;
        }
        for(int i = 0;i<Y.length();i++){
            char ch = Y.charAt(i);
            arr2[ch-'0']++;
        }
        for(int i = 9;i>=0;i--){
            int i1 = arr1[i];
            int i2 = arr2[i];
            if(i1>0 && i2>0){
                int min = Math.min(i1,i2);
                for(int j = 0;j<min;j++){
                    sb.append(i);
                }
            }
        }
        if(sb.length()==0) return "-1";
        else if(sb.charAt(0)=='0') return "0";
        else return sb.toString();
    }
}