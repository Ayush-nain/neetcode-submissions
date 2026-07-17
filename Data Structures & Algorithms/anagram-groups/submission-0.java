class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        HashMap<String,List<String>> hmap=new HashMap<>();
        for( int i=0;i<strs.length;i++)
        {
            String s=strs[i];
            char c[]=s.toCharArray();
            Arrays.sort(c);
            String key=String.valueOf(c);
            if(!hmap.containsKey(key))
            {
                hmap.put(key,new ArrayList());
            }
            hmap.get(key).add(s);
        }        
        return new ArrayList<>(hmap.values());
    }
}
