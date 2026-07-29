class Solution {

    public String encode(List<String> strs) {
        String enc="";
        if(strs.size()==0){
            return "NOSTRING";
        }
        for(String str:strs){
            enc+=str;
            if(str==""){
                enc+="EMPTY";
            }
            enc+="#ENC#";
        }
        return enc;
    }

    public List<String> decode(String str) {
        List<String> dec=new ArrayList<>();
        if(str.equals("NOSTRING")){
            return dec;
        }
        String[] ans=str.split("#ENC#");
        for(String s:ans){
            if(s.equals("EMPTY")){
                dec.add("");
            }else{
            dec.add(s);
            }
        }
        return dec;
    }
}
