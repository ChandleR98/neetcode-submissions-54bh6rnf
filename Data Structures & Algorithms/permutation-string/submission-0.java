class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] have =new int[256];
        int[] needed=new int[256];
        for(int i=0;i<s1.length();i++){
            needed[s1.charAt(i)]++;
        }
        int lo=0;
        for(int hi=0;hi<s2.length();hi++){
            have[s2.charAt(hi)]++;
            while(hi-lo+1>s1.length()){
                have[s2.charAt(lo)]--;
                lo++;
            }
            if(!isnotValid(have,needed)){
                return true;
            }
        }
        return false;
    }
    public boolean isnotValid(int[] have,int[] needed){
        for(int i=0;i<256;i++){
            if(have[i]!=needed[i]){
                return true;
            }
        }
        return false;
    }
}