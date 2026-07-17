class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
        Arrays.sort(strs);
        String res="";
        String st1=strs[0];
        String st2=strs[strs.length-1];
        for(int i=0;i<st1.length() && i<st2.length();i++)
        {
            if(st1.charAt(i)==st2.charAt(i))
               res=res+st1.charAt(i);
            else
              break;
        }        
        return res;
    }
}