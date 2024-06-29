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
//함수로 풀어서 하면
/* 
class Solution {
    public String solution(String my_string) {
        char[] array = my_string.toCharArray();
        for(int i = 0; i < array.length; i++) {
            if (Character.isUpperCase(array[i])) {
                array[i] = Character.toLowerCase(array[i]);
            } else if (Character.isLowerCase(array[i])) {
                array[i] = Character.toUpperCase(array[i]);
            }
        }
        return new String(array);
    }
}
*/
