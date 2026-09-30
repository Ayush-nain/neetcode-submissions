class Solution {
    public int findDuplicate(int[] nums) 
    {
        Stack st=new Stack<>();
        for(int n:nums)
        {
            if(st.contains(n))
            {
                return n;
            }
            st.push(n);
        }        
        return -1;
    }
}
