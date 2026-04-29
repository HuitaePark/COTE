class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> set  = new HashSet<>();
        Set<String> repeated = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        
        if(s.length()<10) return new ArrayList<>();
        
        for(int i=0;i<10;i++){
            sb.append(s.charAt(i));
        }
        set.add(sb.toString());
        
        for(int i = 10;i<s.length();i++){
            sb.deleteCharAt(0);
            sb.append(s.charAt(i));
            String current = sb.toString();
            
            if(!set.add(current)){
                repeated.add(current);
            }
        }
        return new ArrayList<>(repeated);
    }
}