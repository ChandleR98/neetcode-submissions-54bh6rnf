class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j=heights.length-1;
        int ans=0;
        while(i<=j){
            int amt=Math.min(heights[i],heights[j])*(j-i);
            if(heights[i]<heights[j]){
                i++;
            }else{
                j--;
            }
            ans=Math.max(ans,amt);
        }
        return ans;
    }
}
