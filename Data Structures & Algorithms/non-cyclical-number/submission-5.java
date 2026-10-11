class Solution {
    HashSet<Integer> set=new HashSet<>();
    public boolean isHappy(int n) 
    {
        int sum=0;
        while(n!=0)
        {
            int r=n%10;
            sum=sum+(r*r);
            n=n/10;
        }        
        if(sum==1)
        {
            return true;
        }
        if(set.contains(sum))
        {
            return false;
        }
        set.add(sum);
        return isHappy(sum);
    }
}
