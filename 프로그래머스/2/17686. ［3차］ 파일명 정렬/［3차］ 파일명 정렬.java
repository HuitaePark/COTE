import java.util.*;
class Solution {
    public String[] solution(String[] files) {
        String[] answer = new String[files.length];
        List<FileName> list = new ArrayList<>();
        for(int i=0;i<files.length;i++){
            String current = files[i];
            int numberStart = -1;
            int numberEnd = -1;
            String fileHead = "";
            for(int j=0;j<current.length();j++){
                if(current.charAt(j)>='0' && current.charAt(j)<='9'){
                    if(numberStart==-1) numberStart = j;
                    numberEnd = j;
                }
                else if(numberStart!=-1) break;
            }
            list.add(new FileName(
                current.substring(0,numberStart),
                current.substring(numberStart,numberEnd+1),
                current.substring(numberEnd+1)));
        }
        Collections.sort(list,(a,b)->{
            String aHead = a.head.toLowerCase(); 
            String bHead = b.head.toLowerCase();
            if(!aHead.equals(bHead)) return aHead.compareTo(bHead);
            
            int aNumber  = Integer.parseInt(a.number);
            int bNumber = Integer.parseInt(b.number);
            if(aNumber!=bNumber) return aNumber-bNumber;
            
            return 0;
        });
        
        int idx = 0;
        for(FileName f: list){
            answer[idx++] = f.head+f.number+f.tail;
        }
        
        return answer;
    }
    static class FileName{
        String head;
        String number;
        String tail;
        public FileName(String head,String number,String tail){
            this.head = head;
            this.number = number;
            this.tail = tail;
        }
    }
}