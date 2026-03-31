class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int num:nums){
            hs.add(num);
        }
        if(hs.size()==nums.length){
            return false;
        }else{
            return true;
        }
    }
}