class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length, piv=0;
        int[] arr = new int[len];
        for(int i=1;i<len;i++){
            if(nums[i] < nums[i-1]){
                piv = i;
                break;
            }
        }
        for(int j=0,i=piv;i<len;i++){
            arr[j++] = nums[i];
        }
        for(int j=0,i=len-piv; i<len;i++){
            arr[i] = nums[j++];
        }
        System.out.println(Arrays.toString(arr));
        // We got sorted array arr
        int L=0, R=len-1;
        while(L <= R){
            int mid = (L+R)/2;
            if(arr[mid] == target){
                return (mid+piv < len) ? mid+piv : Math.abs(len-(mid+piv));
            }
            else if(arr[mid] > target){
                R = mid-1;
            }
            else{
                L = mid+1;
            }
        }
        return -1;
    }
}