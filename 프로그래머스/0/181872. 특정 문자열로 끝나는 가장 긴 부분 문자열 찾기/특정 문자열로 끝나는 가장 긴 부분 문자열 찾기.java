class Solution {
    public String solution(String myString, String pat) {
        int patSize = pat.length();
        int endIndex = 0;
        for(int i = myString.length()-patSize;i>=0;i--){
            boolean isFind = false;
            if(myString.substring(i,i+patSize).equals(pat)){
                endIndex = i;
                isFind = true;
                break;
            }
            if(isFind) break;
        }
        return myString.substring(0,endIndex+patSize);
    }
}