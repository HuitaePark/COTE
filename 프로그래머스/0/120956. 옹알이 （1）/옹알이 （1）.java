class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] pron = {"aya", "ye", "woo", "ma"};
        for(int i=0;i<babbling.length;i++){
            String current = babbling[i];
            
            while(true){
                boolean isExist = false;
                for(int j=0;j<pron.length;j++){
                    if(current.startsWith(pron[j])){
                        current=current.substring(pron[j].length());
                        isExist = true;
                    }
                }
                if(!isExist) break;
            }
            if(current.isEmpty()){
                 answer++;
            }
        }
        return answer;
    }
}