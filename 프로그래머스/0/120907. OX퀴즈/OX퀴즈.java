class Solution {
    public String[] solution(String[] quiz) {
        String[] arr = new String[quiz.length];
        for(int i=0;i<quiz.length;i++){
            String current = quiz[i];
            String answer = "";
            String[] str = current.split("\\s+");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[2]);
            int c = Integer.parseInt(str[4]);
            if(str[1].equals("+")){
                answer= (a+b==c) ? "O" : "X";
            }
            else{
                answer= (a-b==c) ? "O" : "X";
            }
            arr[i] = answer;
        }
        return arr;
    }
}