class Solution {
    public String minWindow(String s, String t) {
        int[] have=new int[256];
        int [] needed=new int[256];
        for(int i=0;i<t.length();i++){
            needed[t.charAt(i)]++;
        }
        int lo=0;
        
        int start=0;
        int res=Integer.MAX_VALUE;
        for(int hi=0;hi<s.length();hi++){
            have[s.charAt(hi)]++;
            while(isValid(have,needed)){
                int len=hi-lo+1;
                if(len<res){
                    res=len;
                    start=lo;
                }
                have[s.charAt(lo)]--;
                lo++;
            }
        }
        if(res==Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start,start+res);
    }
    public boolean isValid(int[] have,int needed[]){
        for(int i=0;i<256;i++){
            if(have[i]<needed[i]){
                return false;
            }
        }
        return true;
    }
}
