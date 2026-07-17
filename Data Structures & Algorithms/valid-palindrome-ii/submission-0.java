class Solution {
    public boolean validPalindrome(String s) 
    {
        int n=s.length();
        int l=0,r=n-1;
        while(l<=r)
        {
            if(s.charAt(l)==s.charAt(r))
            {
                l++;
                r--;
            }
            else
            {
                return (isPalin(s,l,r-1)||isPalin(s,l+1,r));
            }
        }                
        return true;
    }
    public boolean isPalin(String s,int l,int r)
    {
        while(l<=r)
        {
            if(s.charAt(l)==s.charAt(r))
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