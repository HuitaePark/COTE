import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        Map<Character,Character> map = new HashMap<>(); //판별용 맵 등록
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        int num = s.length();
        s+=s;//회전대신 두번 이어붙이기
        A:for(int i = 0;i<num;i++){
            ArrayDeque<Character> stack = new ArrayDeque<>();
            for(int j=i;j<i+num;j++){
                char c = s.charAt(j);
                if(!map.containsKey(c)){ //열린 괄호일경우 푸쉬
                    stack.push(c);
                }
                else{
                    if(stack.isEmpty()|| !stack.pop().equals(map.get(c)))
                        //닫힌 괄호인데 스택이 비어있거나 팝한 괄호가 닫힌괄호랑 동일할경우
                        //내부 반복문은 종료하고 외부로 이동
                        continue A;
                }
            }
            if(stack.isEmpty())
                answer++;
        }
            
        return answer;
    }
}