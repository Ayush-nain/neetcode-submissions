class Solution {
    public boolean isPalindrome(String s) 
    {
        String st="";
        for(char c:s.toCharArray())
        {
            if(Character.isLetterOrDigit(c))
            {
                st=st+(Character.toLowerCase(c));
            }
        }        
       
        StringBuilder st2 = new StringBuilder();

        for (int i = st.length() - 1; i >= 0; i--) {
            st2.append(st.charAt(i));
        }
        System.out.println(st+" "+st2);
        return st.equals(st2.toString());
    }
}