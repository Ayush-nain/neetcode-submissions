class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) 
    {
        unordered_map<int,int> mp;
        vector<int> res;
        if(k>=nums.size())
        {
            return nums;
        }
        for(auto n:nums)
        {
            mp[n]++;
        }  
        vector<pair<int,int>> vec(mp.begin(),mp.end()) ; 
        sort(vec.begin(), vec.end(),
        [](pair<int,int>& a, pair<int,int>& b)
        {
           return a.second > b.second; // descending frequency
        });
        for(auto n:vec)
        {
            if(k<=0)
            {
                break;
            }
            res.push_back(n.first);
            k--;
        }
        return res; 
    }
};
