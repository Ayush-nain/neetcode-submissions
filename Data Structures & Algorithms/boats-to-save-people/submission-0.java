class Solution {
    public int numRescueBoats(int[] people, int limit) 
    {
        Arrays.sort(people);
        int l=0,r=people.length-1,sum=0,boat=0;
        while(l<=r)
        {
            sum=people[l]+people[r];
            System.out.println(sum);
            if(sum<=limit)
            {
                boat++;
                l++;
                r--;
            }
            else
            {
                if(people[l]>people[r])
                {
                    l++;
                }
                else
                {
                    r--;
                }
                boat++;
            }
        }  
        return boat;      
    }
}