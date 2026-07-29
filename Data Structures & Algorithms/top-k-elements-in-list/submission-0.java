class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.<Integer,Integer>comparingByValue().reversed());
        int[] ans=new int[k];
        int p=0;
        for(Map.Entry<Integer,Integer> entry:list){
            ans[p++]=entry.getKey();
            if(p==k){
                break;
            }
        }
        return ans;
    }
}
