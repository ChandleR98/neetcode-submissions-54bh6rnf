class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set=new HashSet<>();
        for(int i=0;i<nums.length-1;i++){
           
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int ans=nums[i]+nums[j]+nums[k];
                 ArrayList<Integer> temp=new ArrayList<>();
                if(ans>0){
                    k--;
                }else if(ans<0){
                    j++;
                }else{
                   temp.add(nums[i]); 
                   temp.add(nums[j]);
                   temp.add(nums[k]);
                   j++;
                   k--;
                 
                   set.add(temp);
                    
                }
            }
        }
        return new ArrayList<>(set);
    }
}
