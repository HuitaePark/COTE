class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] sound = {"aya", "ye", "woo", "ma"};

        for(int i = 0;i<babbling.length;i++){
            String current = babbling[i]; 
            String prev = "";
            while(!current.isEmpty()){
                boolean isMatched = false;

                for(int j =0;j<sound.length;j++){
                    if(current.startsWith(sound[j]) && !sound[j].equals(prev)){
                        current = current.substring(sound[j].length());
                        isMatched = true;
                        prev = sound[j];
                        break;
                    }    
                }
                if(!isMatched) break;    
            }
            
            if(current.isEmpty()) answer++;
        }
        return answer;
    }
}
