class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])==true){
               continue;
            }else{
                map.put(nums[i],i);
            }
        }
        int[] ans=new int[2];
        for(int j=0;j<nums.length;j++){
            int sum=target-nums[j];
            int min=0;
            if(map.containsKey(sum)==true){
                if(map.get(sum)!=j){
                ans[0]=Math.min(map.get(sum),j);
                ans[1]=Math.max(map.get(sum),j);
                break;
                }else{
                    continue;
                }
            }
        }
        return ans;
    }
}
