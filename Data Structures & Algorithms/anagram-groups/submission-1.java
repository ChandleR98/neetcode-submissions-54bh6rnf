class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();

        HashMap<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            char[] chars=str.toCharArray();
            Arrays.sort(chars);
            String sorted=new String(chars);
            if(map.containsKey(sorted)){
                List<String> temp=map.get(sorted);
                temp.add(str);
                map.put(sorted,temp);
            }else{
                List<String> temp=new ArrayList<>();
                temp.add(str);
                map.put(sorted,temp);
            }
        }
       ans.addAll(map.values());
        return ans;
    }
}
