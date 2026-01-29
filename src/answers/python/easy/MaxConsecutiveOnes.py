from typing import List

class MaxConsecutiveOnes:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        maxOnes = 0
        currentOnes = 0
        for n in nums:
            if n == 1:
                currentOnes += 1
            else:
                if maxOnes < currentOnes:
                    maxOnes = currentOnes
                currentOnes = 0
        return currentOnes if maxOnes < currentOnes else maxOnes