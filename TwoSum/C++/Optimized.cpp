class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> map1;
        for(int i=0;i<nums.size();i++)
        {
            map1[nums[i]] = i;
        }
        for(int i=0;i<nums.size();i++)
        {
            int desired = target - nums[i];
            if(map1.count(desired) && map1[desired] != i)
            {
                return {i, map1[desired]};
            }
        }
        return {};
    }
};
