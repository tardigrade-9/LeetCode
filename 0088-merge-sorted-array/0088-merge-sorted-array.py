class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        i = m-1
        j = n-1
        l = m+n-1
        while l >=0 :
            if j>=0 and i>=0:
                if nums2[j] > nums1[i]:
                    nums1[l] = nums2[j]
                    j = j-1
                else:
                    nums1[l] = nums1[i]
                    i = i-1
            elif j>=0:
                nums1[l] = nums2[j]
                j = j-1
            l = l-1
        
        