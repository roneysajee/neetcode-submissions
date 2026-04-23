class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        countmap = {}
        freq = [[] for x in range(len(nums) + 1)]

        for i in nums:
            countmap[i] = 1 + countmap.get(i,0)
        for num,count in countmap.items():
            freq[count].append(num)
        result = []
        for i in range(len(freq)-1,0,-1):
            for num in freq[i]:
                result.append(num)
                if len(result) == k :
                    return result

        
