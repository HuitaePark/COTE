class Solution {
    public String solution(String my_string, int m, int c) {
        int h = my_string.length()/m;
        char[][] arr = new char[h][m];
        int n = 0;
        while(n<h){
            for(int i =0;i<m;i++){
               arr[n][i] = my_string.charAt(n*m+i); 
            }
            n++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<h;i++){
            for(int j=0;j<m;j++){
                if(j==(c-1)) sb.append(arr[i][j]);
            }
        }
        
        return sb.toString();
    }
}