class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[] lsi=new int[n];
        int[] rsi=new int[n];
        lsi[0]=-1;
        Stack<Integer> stl=new Stack<>();
        stl.push(0);
        for(int i=1;i<n;i++){
            while(!stl.isEmpty() && heights[stl.peek()]>=heights[i]){
                stl.pop();
            }
            lsi[i]=stl.isEmpty() ? -1 : stl.peek();
            stl.push(i);
        }
         rsi[n-1]=n;
        Stack<Integer> str=new Stack<>();
        str.push(n-1);
        for(int i=n-2;i>=0;i--){
            while(!str.isEmpty() && heights[str.peek()]>=heights[i]){
                str.pop();
            }
            rsi[i]=str.isEmpty() ? n : str.peek();
            str.push(i);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans=Math.max(ans,heights[i]*(rsi[i]-lsi[i]-1));
        }
        return ans;
    }
}