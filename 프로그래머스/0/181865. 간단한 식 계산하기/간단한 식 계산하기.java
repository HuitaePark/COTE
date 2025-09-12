class Solution {
    public int solution(String binomial) {
        String[] answer = binomial.split("\\s+");
        int answers = 0;
        switch(answer[1]){
            case "+" : 
                answers =  Integer.parseInt(answer[0]) + Integer.parseInt(answer[2]);
                break;
            case "-" : 
                answers = Integer.parseInt(answer[0]) - Integer.parseInt(answer[2]);
                break;
            case "*" : 
                answers = Integer.parseInt(answer[0]) * Integer.parseInt(answer[2]);
                break;
        }
        return answers;
        
    }
}