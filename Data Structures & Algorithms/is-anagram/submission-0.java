class Solution {
    public boolean isAnagram(String s, String t) {
        char[] string1=s.toCharArray();
        Arrays.sort(string1);
        char[] string2=t.toCharArray();
        Arrays.sort(string2);

        String sorted1=new String(string1);
        String sorted2=new String(string2);

       
        return sorted1.equals(sorted2);
    }
}
