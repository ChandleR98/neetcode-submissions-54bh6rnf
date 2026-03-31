class Solution {

    public String encode(List<String> strs) {
        String str="";
        for(String s:strs){
           if(s.length()==0){
            str+="EMPTY";
           }
            str+=s;
            str+="`";
            
            
        }
        return str;
    }

    public List<String> decode(String str) {
        String[] ans=str.split("`");
        List<String> res=new ArrayList<>();
        if(str!=""){
        for(String s:ans){
            if(s.contains("EMPTY")){
                res.add("");
            }else{

            res.add(s);
            }
        }
        }
        // if(res.size()==0){
        //     res.add("");
        // }
        return res;
    }
}
