class Solution {
    public int maxProfit(int[] prices) 
    {
        int mini=prices[0];
        int tp=0;
        for(int i=0;i<prices.length;i++)
        {
            mini=Math.min(mini,prices[i]);
            int p=prices[i]-mini;
            tp=Math.max(tp,p);
        }
        return tp;
    }
}
