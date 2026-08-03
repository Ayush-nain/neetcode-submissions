class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) 
    {
        ArrayList<Integer> list=new ArrayList<>();
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<k;i++)
        {
            list.add(nums[i]);
            maxi=Math.max(maxi,nums[i]);
            System.out.println("MAxi1 "+maxi);
            System.out.println("num "+nums[i]);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(maxi);  
        int j=0;
        for(int i=k;i<nums.length;i++)
        {
            maxi=Integer.MIN_VALUE;
            list.remove(j);
            list.add(nums[i]);
            System.out.println(nums[i]);
            for(int e=0;e<list.size();e++)
            {
                maxi=Math.max(maxi,list.get(e));
            }
            System.out.println("MAxi "+maxi);
            
            
            ans.add(maxi);
        }      
        int res[]=new int[ans.size()];
        for(int i=0;i<ans.size();i++)
        {
            res[i]=ans.get(i);
        }
        return res;
    }
}
