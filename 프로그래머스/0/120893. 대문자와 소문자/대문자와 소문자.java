class Solution {
    public String solution(String my_string) {
        char[] array = my_string.toCharArray();
        for(int i = 0; i < array.length; i++) {
            if(array[i] >= 65 && array[i] <= 90) {
                array[i] = (char)(array[i] + 32);
            } else if(array[i] >= 97 && array[i] <= 122) {
                array[i] = (char)(array[i] - 32);
            }
        }
        return new String(array);
    }
}
