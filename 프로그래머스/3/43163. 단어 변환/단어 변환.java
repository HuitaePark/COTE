import java.util.*;
class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 1;
        if (!Arrays.asList(words).contains(target)) {
            return 0;
        }
        Queue<Node> q = new ArrayDeque<>();
        boolean[] visited = new boolean[words.length];
        
        q.offer(new Node(begin,0));
        
        while(!q.isEmpty()){
            Node current = q.poll();
            if(current.word.equals(target)) return current.count;
            for(int i=0;i<words.length;i++){
                if(!visited[i] && canConvert(current.word,words[i])){
                    visited[i] = true;
                    q.offer(new Node(words[i],current.count+1));
                }
            }
        }

        return 0;
    }
    boolean canConvert(String s1, String s2){
        int count = 0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)) count++;
        }
        
        return count==1 ? true : false;
    }
    static class Node{
        String word;
        int count;
        public Node(String word,int count){
            this.word = word;
            this.count = count;
        }
    }
}