class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map1=new HashMap<>();

        for(int i=0;i<s.length();i++){
            map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
        }
        boolean flag=true;
        if(s.length()!=t.length()){
            return !flag;
        }
        for(int i=0;i<t.length();i++){
            if(map1.containsKey(t.charAt(i))){
                int temp=map1.get(t.charAt(i));
                temp--;
                if(temp==0){
                    map1.remove(t.charAt(i));
                }else{
                    map1.put(t.charAt(i),temp);
                }
            }else{
                flag=false;
                break;
            }
        }
        return flag;

    }
}
