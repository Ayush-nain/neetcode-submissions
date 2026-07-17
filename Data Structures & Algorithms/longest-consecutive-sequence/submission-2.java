class Solution {
    public int longestConsecutive(int[] nums) 
    {
       HashSet<Integer> set=new HashSet<>();
       int longest=0;
       for(int num:nums)
       {
        set.add(num);
       }      

       for(int n:nums)
       {
        if(!set.contains(n-1))
        {
            int l=1;
            int current=n;
            while(set.contains(current+1))
            {
                l++;
                current++;
            }
            longest=Math.max(l,longest);
        }
       }
       return longest;
    }
}
