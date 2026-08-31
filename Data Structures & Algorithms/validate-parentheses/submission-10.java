class Solution {
    public boolean isValid(String s) 
    {
       Stack<Character> st=new Stack<>();
       if(s.length()==1)
       {
        return false;
       }
       for(char c:s.toCharArray())
       {
        if(c=='{' || c=='[' || c=='(')
        {
            st.push(c);
        }
        else if(st.isEmpty())
        {
            return false;
        }
        else
        {
            char ch=st.pop();
            if((c=='}' && ch!='{') || (c==']' && ch!='[') || (c==')' && ch!='('))
            {
                return false;
            }
        }
       }
       if(!st.isEmpty())
       {
        return false;
       }
       return true;
    }
}
