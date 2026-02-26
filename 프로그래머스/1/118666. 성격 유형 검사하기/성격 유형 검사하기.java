import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character,Integer> map = new HashMap<>();
        int[] score = {3,2,1,0,1,2,3}; 
            for(int i=0;i<survey.length;i++){
            String current = survey[i];
            int choice = choices[i];
            char ch1 = current.charAt(0);
            char ch2 = current.charAt(1);
            if(choice>4){
                map.put(ch2,map.getOrDefault(ch2,0)+score[choice-1]);
            }
            else if (choice<4){
                 map.put(ch1,map.getOrDefault(ch1,0)+score[choice-1]);
            }
                
        }
        StringBuilder sb = new StringBuilder();

        if(map.getOrDefault('R',0)>=map.getOrDefault('T',0)){
            sb.append('R');
        }
        else{
            sb.append('T');
        }
        if(map.getOrDefault('C',0)>=map.getOrDefault('F',0)){
            sb.append('C');
        }
        else{
            sb.append('F');
        }
        if(map.getOrDefault('J',0)>=map.getOrDefault('M',0)){
            sb.append('J');
        }
        else{
            sb.append('M');
        }
        if(map.getOrDefault('A',0)>=map.getOrDefault('N',0)){
            sb.append('A');
        }
        else{
            sb.append('N');
        }

        return sb.toString();
    }
}
