class Solution {
    public String solution(String code) {
        boolean mode = false;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<code.length();i++){
            if(!mode){
                if(code.charAt(i)!='1'){
                    if(i%2==0) sb.append(code.charAt(i));
                }
                else mode = true;
            }
            else{
                if(code.charAt(i)!='1'){
                    if(i%2==1) sb.append(code.charAt(i));
                }
                else mode= false;
            }
        }
        if(sb.length()==0) return "EMPTY";
        else return sb.toString();
    }
}