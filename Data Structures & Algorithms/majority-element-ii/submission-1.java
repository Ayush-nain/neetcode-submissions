class Solution {
    public List<Integer> majorityElement(int[] nums) 
    {
        int s=nums.length;
        ArrayList<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }        
        for( int m:nums)
        {
            if(map.get(m)>(int)(s/3))
            {
                if(!ans.contains(m))
                    ans.add(m);
            }
        }
        return ans;
    }
}