class Solution {
    public String mergeAlternately(String word1, String word2) 
    {
        int n=word1.length(),n1=word2.length(),i=0,j=0; 
        String st="";   
        while(n>0 && n1>0)
        {
            st=st+word1.charAt(i);
            st=st+word2.charAt(j);
            i++;j++;
            n--;n1--;
        }    
        if(n>0)
        {
            for(int k=i;k<word1.length();k++)
            {
                st=st+word1.charAt(k);
            }
        }
        if(n1>0)
        {
            for(int k=j;k<word2.length();k++)
            {
                st=st+word2.charAt(k);
            }
        }
        return st;
    }
}