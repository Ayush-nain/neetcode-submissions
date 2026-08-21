class Solution {
    public int maxArea(int[] heights) 
    {
        int p,l=0,r=heights.length-1;
        int maxwater=0;
        while(l<=r)
        {
            p=Math.min(heights[l],heights[r])*(r-l);
            maxwater=Math.max(maxwater,p);
            if(heights[l]<heights[r])
            {
                l++;
            }
            else
            {
                r--;
            }
        }     
        return maxwater;
    }
}
