class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length;
        int mid = -999;
        
        if(target > nums[high-1]){
            return high;
        }

        while(low <= high){
            mid = (low + high)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        } 
        return low;
    }
}