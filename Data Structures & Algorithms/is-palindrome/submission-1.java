class Solution {
    public boolean isPalindrome(String s) 
    {
        String st="";
        for(int i=0;i<s.length();i++)
        {
            if(!Character.isLetterOrDigit(s.charAt(i)))
            {
                continue;
            }
            st=st+s.charAt(i);
        }        
        int n=st.length();
        int l=0,r=n-1;
        st=st.toLowerCase();
        System.out.println(st);
        while(l<=r)
        {
            if(st.charAt(l)==st.charAt(r))
            {
                l++;
                r--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
