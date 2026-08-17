class Solution {
    public int firstMissingPositive(int[] nums) 
    {
       Arrays.sort(nums);
       int mini=nums[0];
       int maxi=nums[nums.length-1];
       int c=0;
       HashSet<Integer> set = new HashSet<>();
       for (int num : nums) 
       {
        set.add(num);
        if(num>0)
        {
            c=1;
        }
       }
       if(c==0)
       {
        return 1;
       }
       for(int i=1;i<=maxi;i++)
       {
        if(!set.contains(i))
        {
            return i;
        }
       }
       return maxi+1;
    }
}