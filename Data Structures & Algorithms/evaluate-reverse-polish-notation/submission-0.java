class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st=new Stack<>();
        for(String token:tokens){
           if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                String b=st.pop();
                String a=st.pop();
                int res=0;
                switch(token){
                    case "+": res=Integer.parseInt(a)+Integer.parseInt(b);st.push(Integer.toString(res));break;
                    case "-": res=Integer.parseInt(a)-Integer.parseInt(b);st.push(Integer.toString(res));break;
                    case "*": res=Integer.parseInt(a)*Integer.parseInt(b);st.push(Integer.toString(res));break;
                    case "/":res=Integer.parseInt(a)/Integer.parseInt(b);st.push(Integer.toString(res));break;
                }
            }else{
                st.push(token);
            }
        }
        return Integer.parseInt(st.peek());
    }
}