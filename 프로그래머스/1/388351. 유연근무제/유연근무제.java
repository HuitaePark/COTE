class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        boolean[] isWinner =  new boolean[schedules.length];
        for(int i=0;i<schedules.length;i++){
            isWinner[i] =true;
        }
        for(int i=0;i<schedules.length;i++){
            int currentTime = schedules[i];
            int day = startday;
            for(int j=0;j<timelogs[0].length;j++){
                int currentDay = (startday + j - 1) % 7 + 1;
                if (currentDay >= 6) continue;
                int hour1 = currentTime/100 * 60 + currentTime%100+10;
                int hour2 = timelogs[i][j]/100 * 60 + timelogs[i][j]%100;

                if(hour2>hour1){
                    isWinner[i] = false;
                    break;
                }
                day++;
            }
        }
        for(int i=0;i<isWinner.length;i++){
            if(isWinner[i]) answer++;
        }
        return answer;
    }
}

