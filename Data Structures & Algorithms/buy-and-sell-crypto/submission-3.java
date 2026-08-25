class Solution {
    public int maxProfit(int[] prices) 
    {
        int mini=prices[0],tp,maxp=Integer.MIN_VALUE;
        for(int i=1;i<prices.length;i++)
        {
            mini=Math.min(prices[i],mini);
            tp=prices[i]-mini;
            maxp=Math.max(tp,maxp);
        }
        return maxp==Integer.MIN_VALUE?0:maxp;
    }
}
