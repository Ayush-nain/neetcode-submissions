class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int p=1,c=0;
        int arr[]=new int[nums.length];
       int prefix[]=new int[nums.length];
       int suffix[]=new int[nums.length];
       int n=nums.length;
       for(int i=0;i<n;i++)
       {
        if(i==0)
        {
            prefix[i]=1;
        }
        else
        {
            prefix[i]=prefix[i-1]*nums[i-1];
        }
       }
       for(int i=n-1;i>=0;i--)
       {
        if(i==n-1)
        {
            suffix[i]=1;
        }
        else
        {
            suffix[i]=suffix[i+1]*nums[i+1];
        }
       }
       int ans[]=new int[n];
       for(int i=0;i<n;i++)
       {
        ans[i]=prefix[i]*suffix[i];
       }
       return ans;
    }
}  
