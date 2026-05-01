class Solution {
    public int searchInsert(int[] nums, int target) {
        int idx = -1;
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(nums[mid]==target) {
                idx = mid;
                break;
            }

            if(nums[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }

        if(idx==-1) return start;
        else return idx;

    }
}