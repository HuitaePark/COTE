class Solution {
    String[] parks;
    public int[] solution(String[] park, String[] routes) {
        int r = 0;
        int c = 0;
        parks = park;
        
        for(int i=0; i<park.length; i++){
            for(int j=0; j<park[i].length(); j++){
                if(park[i].charAt(j) == 'S'){
                    r = i; c = j;
                    break;
                }
            }
        }
        
        for(String route : routes){
            String[] str = route.split(" ");
            String dir = str[0];
            int count = Integer.parseInt(str[1]);
            
            int currR = r;
            int currC = c;
            boolean canMove = true;

            for(int i=0; i<count; i++){
                if(dir.equals("E")) currC++;
                else if(dir.equals("W")) currC--;
                else if(dir.equals("S")) currR++;
                else if(dir.equals("N")) currR--;
                

                if(currR < 0 || currR >= parks.length || currC < 0 || currC >= parks[0].length() || parks[currR].charAt(currC) == 'X'){
                    canMove = false;
                    break;
                }
            }

            if(canMove){
                r = currR;
                c = currC;
            }
        }
        
        return new int[]{r, c};
    }
}