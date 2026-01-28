class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for(int i =0;i<num_list.length;i++){
            int current = num_list[i];
            int count = 0;
            while(true){
                if(current==1) break;
                if(current%2==0){
                   current/=2;
                }
                else{ 
                    current-=1;
                    current/=2;
                }
                count++;
            }
            answer+=count;
            System.out.println(count);
        }
        return answer;
    }
}