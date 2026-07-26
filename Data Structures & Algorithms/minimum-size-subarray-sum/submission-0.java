class Solution {
    public int minSubArrayLen(int target, int[] nums) 
    {
        int l=0,sum=0,minlen=Integer.MAX_VALUE;
        for(int r=0;r<nums.length;r++)
        {
            sum+=nums[r];
            while(sum>=target)
            {
                minlen=Math.min(minlen,r-l+1);
                sum-=nums[l];
                l++;
            }
        }         
        if(minlen==Integer.MAX_VALUE)
        {
            return 0;
        }
        return minlen;
    }
}