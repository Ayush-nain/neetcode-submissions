class Solution {
    public int characterReplacement(String s, int k) 
    {
        int l=0,maxlen=Integer.MIN_VALUE,a=0,maxf=0;
        HashMap<Character,Integer> hmap=new HashMap<>();
        for(int r=0;r<s.length();r++)
        {
            hmap.put(s.charAt(r),hmap.getOrDefault(s.charAt(r),0)+1);
            maxf=Math.max(maxf,hmap.get(s.charAt(r)));
            while((r-l+1)-maxf>k)
            {
                hmap.put(s.charAt(l),hmap.get(s.charAt(l))-1);
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1);
        }
        return maxlen!=Integer.MIN_VALUE?maxlen:0;
    }
}
