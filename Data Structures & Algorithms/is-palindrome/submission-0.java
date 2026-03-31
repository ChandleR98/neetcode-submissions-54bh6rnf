class Solution {
    public boolean isPalindrome(String s) {
        char[] str=s.toCharArray();
        String pal="";
        String curr="";

        for(int i=str.length-1;i>=0;i--){
            if((str[i]>='a' && str[i]<='z')||(str[i]>='A' && str[i]<='Z')||(str[i]>='0'&&str[i]<='9'))
            pal+=str[i];
        }
        for(int i=0;i<str.length;i++){
            if((str[i]>='a' && str[i]<='z')||(str[i]>='A' && str[i]<='Z')||(str[i]>='0'&&str[i]<='9'))
            curr+=str[i];
        }
        String palin=new String(pal);

        return palin.toLowerCase().equals(curr.toLowerCase());
    }
}
