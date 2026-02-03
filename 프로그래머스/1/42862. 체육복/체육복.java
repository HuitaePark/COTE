import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(reserve);
        Arrays.sort(lost);
        Set<Integer> set = new HashSet<>();
        for (int i : lost) {
            set.add(i); 
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : reserve){
            if(set.contains(i)){
                set.remove(i);
            }
            else list.add(i);
        }
        for(int i = 0;i<list.size();i++){
            int current = list.get(i);
            if(set.contains(current-1)){
                set.remove(current-1);
            }
            else if(set.contains(current+1)){
                set.remove(current+1);
            }
        }
        return n-set.size();
    }
}