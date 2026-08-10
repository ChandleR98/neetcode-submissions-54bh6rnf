class Solution {
    public int findMin(int[] nums) {
        int lo=0;
        int hi=nums.length-1;
        while(lo<hi){
            int mid=(lo+hi)/2;
            if(nums[lo]<nums[mid]){
                if(nums[lo]<nums[hi]){
                    hi=mid;
                }else{
                    lo=mid+1;
                }
            }else{
                if(nums[hi]<nums[mid]){
                    lo=mid+1;
                }else{
                    hi=mid;
                }
            }
        }
        return nums[lo];
    }
}
