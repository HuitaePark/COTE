class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int count = 6;
        int zeroCount = 0;
        for(int i=0;i<lottos.length;i++){
            boolean isWin = false;
            if(lottos[i]==0) zeroCount++;
            else{
                for(int j=0;j<win_nums.length;j++){
                    if(lottos[i]==win_nums[j]) isWin = true;
                }
            }
            if(!isWin) count--;
        }
        int best = 0;
        int worst = 0;
        
        if(count+zeroCount ==6) best = 1;
        else if(count+zeroCount ==5) best = 2;
        else if(count+zeroCount ==4) best = 3;
        else if(count+zeroCount ==3) best = 4;
        else if(count+zeroCount ==2) best = 5;
        else best = 6;
    
        
        if(count==6) worst = 1;
        else if(count==5) worst =2;
        else if(count==4) worst =3;
        else if(count==3) worst =4;
        else if(count==2) worst =5;
        else worst = 6;
        
        return new int[]{best,worst};
    }
}