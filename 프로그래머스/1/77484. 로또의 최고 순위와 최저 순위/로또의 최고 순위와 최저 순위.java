import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zero = 0;
        int max = 0;
        int min = 0;
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=0;i<lottos.length;i++){
            if(lottos[i]==0){
                zero++;
                continue;
            }
            list.add(lottos[i]);
        }
        
        Arrays.sort(win_nums);
        Collections.sort(list);
        
        int left = 0;
        int right = 0;
        int winCount = 0;
        while(left<list.size() && right<win_nums.length){
            if(list.get(left)==win_nums[right]){
                winCount++;
                left++;
                right++;
            }
            else if(list.get(left)>win_nums[right]){
                right++;
            }
            else{
                left++;
            }
        }
        
        int first = 6;
        int last = 6;
        
        if(winCount+zero==6){
            first = 1;
        }
        else if(winCount+zero==5){
            first = 2;
        }
        else if(winCount+zero==4){
            first = 3;
        }
        else if(winCount+zero==3){
            first = 4;
        }
        else if(winCount+zero==2){
            first = 5;
        }
        
        if(winCount==6){
            last = 1;
        }
        else if(winCount==5){
            last = 2;
        }
        else if(winCount==4){
            last = 3;
        }
        else if(winCount==3){
            last = 4;
        }
        else if(winCount==2){
            last = 5;
        }
        
        return new int[]{first,last};
    }
}