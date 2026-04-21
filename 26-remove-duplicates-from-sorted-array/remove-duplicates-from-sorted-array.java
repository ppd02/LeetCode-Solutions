class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                nums[i-1] = -999;
            }
            else{
                k++;
            }
        }
        for(int i=0,j=0;i<nums.length;i++){
            if(nums[i] == -999){
                continue;
            }else{
                nums[j++] = nums[i];
            }
        }
        // System.out.println(Arrays.toString(nums));
        return k;
    }
}