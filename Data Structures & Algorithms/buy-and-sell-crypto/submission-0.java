class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[] lmin=new int[n];
        lmin[0]=prices[0];
        for(int i=1;i<n;i++){
            lmin[i]=Math.min(lmin[i-1],prices[i]);

        }
       
        int ans=0;
        for(int i=0;i<n;i++){
            int profit=prices[i]-lmin[i];
            ans=Math.max(ans,profit);
        }
        return ans;
    }
}
