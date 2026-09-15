class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        HashSet<Character> set=new HashSet<>();
        int l=0,maxlen=Integer.MIN_VALUE;
        for(int r=0;r<s.length();r++)
        {
            char c=s.charAt(r);
            while(set.contains(c))
            {
                char ch=s.charAt(l);
                set.remove(ch);
                l++;
            }
            set.add(c);
            maxlen=Math.max(maxlen,r-l+1);
        }
        return maxlen==Integer.MIN_VALUE?0:maxlen;
    }
}