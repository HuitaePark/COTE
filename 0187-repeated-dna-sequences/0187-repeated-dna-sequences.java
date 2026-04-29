class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> set  = new HashSet<>();
        Set<String> dup  = new HashSet<>();
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        if(s.length()<10) return list;
        
        for(int i=0;i<10;i++){
            sb.append(s.charAt(i));
        }
        set.add(sb.toString());
        
        for(int i = 10;i<s.length();i++){
            sb.deleteCharAt(0);
            sb.append(s.charAt(i));
            String current = sb.toString();
            
            if(set.contains(current) && !dup.contains(current)){
                list.add(current);
                dup.add(current);
            }
            else set.add(current);
        }
        return list;
    }
}