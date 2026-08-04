class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lo=1;
        int hi=0;
        for(int pile:piles){
            hi=Math.max(pile,hi);
        }
        while(lo<hi){
            int mid=(lo+hi)/2;
            int hours=0;
            for(int pile:piles){
                hours+=(int)Math.ceil((double)pile/mid);

            }
            if(hours<=h){
                hi=mid;
            }else{
                lo=mid+1;
            }
        }
        return lo;
    }
}
