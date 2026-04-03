class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int x:nums){
            hs.add(x);
        }
     
        ArrayList<Integer> al=new ArrayList<>();
       for(int x:hs){
        al.add(x);
       }
       Collections.sort(al);
       int len=0;
       int maxLen=0;
       for(int i=1;i<al.size();i++){
        System.out.print(al.get(i)+" ");
        if(al.get(i)-al.get(i-1)==1){
            len++;
        }else{
            len=0;
        }
        maxLen=Math.max(len,maxLen);
       }
       if(nums.length==0){
        return 0;
       }
       return maxLen+1;
    }
}
