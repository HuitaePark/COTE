import java.util.*;
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        Set<Character> set = new HashSet<>();
        for(int i=0;i<skill.length();i++){ //선행스킬 셋
            set.add(skill.charAt(i));
        }
        for(int i=0;i<skill_trees.length;i++){
            String current = skill_trees[i];
            boolean isOk = true;
            //순서 큐 초기화
            Queue<Character> q = new ArrayDeque<>();
            for(int j=0;j<skill.length();j++){
                q.offer(skill.charAt(j));
            }
            //스킬이 선행스킬의 peek가 아닐경우 스킬트리 불가
            for(int j=0;j<current.length();j++){
                if(set.contains(current.charAt(j))){
                    if(!q.isEmpty() && q.peek()==current.charAt(j)){
                        q.poll();
                    }
                    else{
                        isOk = false;
                        break;
                    }
                }
            }
            if(isOk) answer++;
        }
        return answer;
    }
}