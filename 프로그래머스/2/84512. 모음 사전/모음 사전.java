class Solution {
    int count = 0;
    int answer = 0;
    char[] vowels = {'A', 'E', 'I', 'O', 'U'};
    public int solution(String word) {
        dfs("",word);
        return answer;
    }
    void dfs(String current,String target){
        if(current.equals(target)){
            answer = count;
            return;
        }
        if(current.length()==5) return;
        
        for(int i=0;i<5;i++){
            count++;
            dfs(current+vowels[i],target);
            if(answer!=0) return;
        }
    }
}