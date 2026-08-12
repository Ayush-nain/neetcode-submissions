class Solution {
    public int majorityElement(int[] nums) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }        
        int v=map.get(nums[0]),ans=nums[0];
        for(int i=1;i<map.size();i++)
        {
            if(v<map.get(nums[i]))
            {
                ans=nums[i];
            }
        }
        return ans;
    }
}