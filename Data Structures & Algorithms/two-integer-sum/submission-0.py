class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dict1 = {}
        for i,v in enumerate(nums):
            diff = target - v
            if( v in dict1):
                return [dict1[v],i]
            else:
                dict1[diff] = i
        
        