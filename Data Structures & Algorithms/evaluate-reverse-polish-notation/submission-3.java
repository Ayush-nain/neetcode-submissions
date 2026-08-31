class Solution {
    public int evalRPN(String[] tokens) 
    {
        Stack<Integer> st = new Stack<>();
        int s;
        for(String token:tokens)
        {
            if(token.equals("+"))
            {
                int first=st.pop();
                int second=st.pop();
                s=first+second;
                st.push(s);
            }
            else if(token.equals("*"))
            {
                int first=st.pop();
                int second=st.pop();
                s=first*second;
                st.push(s);
            }
            else if(token.equals("-"))
            {
                int first=st.pop();
                int second=st.pop();
                s=second-first;
                st.push(s);
            }
            else if(token.equals("/"))
            {
                int first=st.pop();
                int second=st.pop();
                s=second/first;
                st.push(s);
            }
            else
            {
                st.push(Integer.parseInt(token));
            }
        }
        return st.peek();
    }
}