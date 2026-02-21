class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] arr1 = arr.clone();
        while(true){
            int[] arr2 = new int[arr.length];
            for(int i=0;i<arr.length;i++){
                if(arr1[i]>=50 && arr1[i]%2==0) arr2[i] = arr1[i]/2;
                else if(arr1[i]<50 && arr1[i]%2!=0)arr2[i] = arr1[i]*2+1;
            }
            if(isMatching(arr1,arr2)) break;
            answer++;
            arr1 = arr2.clone();
        }
        return answer-1;
    }
    
    boolean isMatching(int[] arr1, int[] arr2){
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]) return false;
        }
        return true;
    }
}