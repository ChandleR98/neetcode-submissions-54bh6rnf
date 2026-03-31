class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0;
        for(i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])==true){
                continue;
            }else{
                map.put(nums[i],i);
            }
        }
        int[] ans=new int[2];
        for( i=0;i<nums.length;i++){
            int sum=target-nums[i];
            if(map.containsKey(sum)==true){
                if(map.get(sum)!=i){
                    ans[0]=Math.min(map.get(sum),i);
                    ans[1]=Math.max(map.get(sum),i);
                }
            }else{
                continue;
            }
        }
        return ans;
    }
}
