import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        Queue<Node> min = new PriorityQueue<>((a,b)->a.value-b.value);
        Queue<Node> max = new PriorityQueue<>((a,b)->b.value-a.value);
        
        for(int i=0;i<operations.length;i++){
            String[] arr = operations[i].split(" ");
            
            if(arr[0].equals("I")){
                Node node = new Node(Integer.parseInt(arr[1]), false);
                min.offer(node);
                max.offer(node);
            }
            else{
                if(arr[1].equals("1")){
                    clean(max);
                    if(!max.isEmpty()){
                        Node node = max.poll();
                        node.isDelete = true;
                    }
                }
                else{
                    clean(min);
                    if(!min.isEmpty()){
                        Node node = min.poll();
                        node.isDelete = true;
                    }
                }
            }
        }
        
        clean(max);
        clean(min);
        
        if (min.isEmpty()) {
            return new int[]{0, 0};
        }
        return new int[]{max.peek().value,min.peek().value};
    }
    
    class Node{
        int value;
        boolean isDelete;
        
        public Node(int value,boolean isDelete){
            this.value = value;
            this.isDelete = isDelete;
        }
    }
    
    private void clean(Queue<Node> pq) {
        while (!pq.isEmpty() && pq.peek().isDelete) {
            pq.poll();
        }
    }
    
}