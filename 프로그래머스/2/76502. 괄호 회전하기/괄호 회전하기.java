import java.util.*;
class Solution {
    char[] original;
    char[] copy;
    int answer = 0;
    public int solution(String s) {
        original = new char[s.length()];
        for(int i=0;i<s.length();i++){
            original[i] = s.charAt(i);
        }
        if(isCorrect(original)) answer++;
        copy = rolling(original);
        
        while(!isEqual(original,copy)){
            if(isCorrect(copy)) answer++;
            copy = rolling(copy);
        }
        return answer;
    }
    
    char[] rolling(char[] arr){
        char[] copy = new char[arr.length];
        copy[copy.length-1] = arr[0];
        for(int i=1;i<arr.length;i++){
            copy[i-1] = arr[i];
        }
        return copy;
    }
    
    boolean isEqual(char[] original,char[] copy){
        for(int i=0;i<original.length;i++){
            if(original[i]!=copy[i]) return false;
        }
        return true;
    }
    
    boolean isCorrect(char[] arr){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(stack.isEmpty()){
                if(arr[i]==']' || arr[i]=='}' || arr[i]==')') return false;
                else stack.push(arr[i]);
            }
            else if(stack.peek()=='['){
                if(arr[i]==']') stack.pop();
                else if(arr[i]=='}' || arr[i]==')') return false;
                else stack.push(arr[i]);
            }
            else if(stack.peek()=='{'){
                if(arr[i]=='}') stack.pop();
                else if(arr[i]==']' || arr[i]==')') return false;
                else stack.push(arr[i]);
            }
            else if(stack.peek()=='('){
                if(arr[i]==')') stack.pop();
                else if(arr[i]=='}' || arr[i]==']') return false;
                else stack.push(arr[i]);
            }
        }
        if(!stack.isEmpty()) return false;
        return true;
    }
}