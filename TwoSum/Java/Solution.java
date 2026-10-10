class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map1 = new HashMap<>();
        int n = nums.length;

        for(int i=0 ;i<n ;i++)
        {
            map1.put(nums[i],i);
        }
        for(int i=0;i<n;i++)
        {
            int desired = target - nums[i];
            if(map1.containsKey(desired) && map1.get(desired) != i)
            {
                return new int[]{i, map1.get(desired)};
            }
        }
        return new int[]{};
    }
}
