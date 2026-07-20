class Solution {
    public int maxArea(int[] heights) 
    {
        int p;
        int maxwater=0;
        for(int i=0;i<heights.length;i++)
        {
            for(int j=i+1;j<heights.length;j++)
            {
                p=Math.min(heights[i],heights[j])*(j-i);
                maxwater=Math.max(maxwater,p);                
            }
        }   
        return maxwater;     
    }
}
