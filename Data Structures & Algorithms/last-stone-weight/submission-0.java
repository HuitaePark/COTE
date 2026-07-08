class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++){
            q.offer(stones[i]);
        }

        while(q.size()>1){
            int a = q.poll();
            int b = q.poll();
            if(a!=b){
                if(a>b) q.offer(a-b);
                else q.offer(b-a);
            }
        }

        if(q.isEmpty()) return 0;
        else return q.poll();
    }
}
