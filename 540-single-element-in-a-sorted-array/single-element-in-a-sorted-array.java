class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        for(int i=0,j=1;i<nums.length;i+=2,j+=2){
            if(j >= nums.length){
                return nums[i];
            }
            if(nums[i] != nums[j]){
                return nums[i];
            }
        }
        return 0;
    }
}