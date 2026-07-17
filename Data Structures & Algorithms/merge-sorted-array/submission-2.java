class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int j=0,n1=n;
       for(int i=0;i<m+n;i++)
       {
        
        if(nums1[i]==0 && n1>0)
        {
            nums1[i]=nums2[j++];
           n1--;
        }
       }
       Arrays.sort(nums1);

    }
}