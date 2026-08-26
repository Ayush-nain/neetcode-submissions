class Solution {
    public int characterReplacement(String s, int k) 
    {
       HashMap<Character,Integer> map=new HashMap<>();
       int l=0,maxlen=Integer.MIN_VALUE,maxf=0;
       for(int r=0;r<s.length();r++)
       {
        char c=s.charAt(r);
        map.put(c,map.getOrDefault(c,0)+1);
        maxf=Math.max(maxf,map.get(c));
        while(r-l+1-maxf>k)
        {
            char ch=s.charAt(l);
            map.put(ch,map.get(ch)-1);
            l++;
        }
        maxlen=Math.max(maxlen,r-l+1);
       }
       return maxlen==Integer.MIN_VALUE?0:maxlen;
    }
}
