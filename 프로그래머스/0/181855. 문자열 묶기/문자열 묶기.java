class Solution {
    public int solution(String[] strArr) {
        int[] arr = new int[100001];
        for(int i=0;i<strArr.length;i++){
            arr[strArr[i].length()]++;
        }
        int max = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max) max = arr[i];
        }
        return max;
    }
}