class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        hash1 = {}
        for i, num in enumerate(nums):
            hash1[num] = i
        
        for i, num in enumerate(nums):
            desired = target - num
            if desired in hash1 and hash1[desired] != i:
                return [i, hash1[desired]]
