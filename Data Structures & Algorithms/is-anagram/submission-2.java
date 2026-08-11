class Solution {
    public boolean isAnagram(String s, String t) 
    {
       HashMap<Character,Integer> map=new HashMap<>();
       if(s.length()!=t.length())
       {
        return false;
       }
       for(char c:s.toCharArray())
       {
        map.put(c,map.getOrDefault(c,0)+1);
       }
       for(int i=0;i<t.length();i++)
       {
        if (!map.containsKey(t.charAt(i))) 
        {
            return false;
        }
        map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)-1);
       }
       int c=0;
       for(int m:map.values())
       {
        if(m!=0)
        {
            return false;
        }
       }
      return true;
    }
}
