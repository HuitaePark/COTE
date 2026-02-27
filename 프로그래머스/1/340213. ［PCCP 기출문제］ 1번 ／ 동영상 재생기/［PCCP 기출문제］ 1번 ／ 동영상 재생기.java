class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int len = getSecond(video_len);
        int position = getSecond(pos);
        int start = getSecond(op_start);
        int end = getSecond(op_end);
        for(int i=0;i<commands.length;i++){
            String current = commands[i];
            if(position>=start && position<=end) position = end;
            if(current.equals("next")){
                if(position+10>len) position = len;
                else position+=10;
            }
            else if(current.equals("prev")){
                if(position-10<0) position = 0;
                else position-=10;
            }
            if(position>=start && position<=end) position = end;
        }
        StringBuilder sb = new StringBuilder();
        if(position/60<10){
            sb.append(0).append(position/60).append(":");
        }
        else{
            sb.append(position/60).append(":");
        }
        
        if(position%60<10){
            sb.append(0).append(position%60);
        }
        else sb.append(position%60);
        
        return sb.toString();
    }
    int getSecond(String time){
        String[] arr = time.split(":");
        return Integer.parseInt(arr[0]) * 60 + Integer.parseInt(arr[1]);
    }
}