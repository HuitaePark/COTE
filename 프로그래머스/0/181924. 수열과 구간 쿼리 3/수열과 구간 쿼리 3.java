class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i =0;i<queries.length;i++){
            int temp =0;
            temp = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = temp;
        }
        return arr;
    }
}