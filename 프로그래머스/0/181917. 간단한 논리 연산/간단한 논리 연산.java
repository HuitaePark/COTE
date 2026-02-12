class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        if(x1){
            if(x2){
                if(x3){
                    if(x4) return answer;//TTTT
                    else return answer;//TTTF
                }
                else{
                    if(x4) return answer;//TTFT
                    else return !answer;//TTFF
                }
            }
            else{
                if(x3){
                    if(x4) return answer;//TFTT
                    else return answer;//TFTF
                }
                else{
                    if(x4) return answer;//TFFT
                    else return !answer;//TFFF
                }
            }
        }
        else{
            if(x2){
                if(x3){
                    if(x4) return answer;//FTTT
                    else return answer;//FTTF
                }
                else{
                    if(x4) return answer;//FTFT
                    else return !answer;//FTFF
                }
            }
            else{
                if(x3){
                    if(x4) return !answer;//FFTT
                    else return !answer;//FFTF
                }
                else{
                    if(x4) return !answer;//FFFT
                    else return !answer;//FFFF
                }
            }
        }
    }
}