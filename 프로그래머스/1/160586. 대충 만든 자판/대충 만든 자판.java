class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int[] arr = new int[26];
        for(int i=0;i<keymap.length;i++){
            String current = keymap[i];
            for(int j=0;j<current.length();j++){
                int index = current.charAt(j)-'A';             
                if(arr[index]==0) arr[index] = j+1;
                else arr[index] = Math.min(arr[index],j+1);
            }
        }
        for (int i = 0; i < targets.length; i++) {
            int sum = 0;
            boolean impossible = false;
            for (int j = 0; j < targets[i].length(); j++) {
                int idx = targets[i].charAt(j) - 'A';
                if (arr[idx] == 0) {
                    impossible = true;
                    break;
                }
                sum += arr[idx];
            }
            answer[i] = impossible ? -1 : sum;
        }
        return answer;
    }
}