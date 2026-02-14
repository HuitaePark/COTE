import java.util.*;
class Solution {
    public  List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<>();
        for(int i=2;i<=n;i++){
            if(n%i==0) answer.add(i);
        }
        List<Integer>list = new ArrayList<>();
        for(int i=0;i<answer.size();i++){
            int current = answer.get(i);
            for(int j=i+1;j<answer.size();j++){
                if(answer.get(j)%current==0){
                    answer.remove(j);
                    j--;
                }
            }
            list.add(current);
        }
        
        return list;
    }
}