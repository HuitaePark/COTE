class Solution {
    public int solution(String before, String after) {
        int[] bArr = new int[26];
        int[] aArr = new int[26];
        
        for(int i =0;i<before.length();i++){
            bArr[before.charAt(i)-'a']++;
            aArr[after.charAt(i)-'a']++;
        }
        
        for(int i = 0;i<26;i++){
            if(bArr[i] != aArr[i]){
                return 0;
            }
        }
        return 1;
    }
}