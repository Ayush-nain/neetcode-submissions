class Solution {
public:
    int majorityElement(vector<int>& nums) 
    {
        int major=INT_MIN,result=0;
        unordered_map<int,int> mp;
        for(auto &num : nums)
        {
            mp[num]++;
        }        
        for(auto &ele:mp)
        {
            if(major<ele.second)
            {
                result=ele.first;
                major=ele.second;
            }
        }
        return result;
    }
};