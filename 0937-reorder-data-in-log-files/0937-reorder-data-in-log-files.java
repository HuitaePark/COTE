import java.util.*;
class Solution {
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs,(a,b)->{
            String[] arr1 = a.split(" ",2);
            String[] arr2 = b.split(" ",2);

            String id1 = arr1[0];
            String body1 = arr1[1];

            String id2 = arr2[0];
            String body2 = arr2[1];

            boolean isDigit1 = Character.isDigit(body1.charAt(0));
            boolean isDigit2 = Character.isDigit(body2.charAt(0));

            if(isDigit1 && isDigit2){
                return 0;
            }
            else if(isDigit1 && !isDigit2){
                return 1;
            }
            else if(!isDigit1 && isDigit2){
                return -1;
            }
            int cmp = body1.compareTo(body2);
            if(cmp!=0) return cmp;

            return id1.compareTo(id2);
        });

        return logs;
    }
}