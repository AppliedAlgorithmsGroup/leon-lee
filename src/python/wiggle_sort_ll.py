# -*- coding: utf-8 -*-
"""#324 Wiggle Sort II (Media).

(https://leetcode.com/problems/wiggle-sort-ii/?tab=Description#/description)

Given an unsorted array nums, reorder it such that

        nums[0] < nums[1] > nums[2] < nums[3]....

Example:
(1) Given nums = [1, 5, 1, 1, 6, 4], one possible answer is [1, 4, 1, 5, 1, 6].
(2) Given nums = [1, 3, 2, 2, 3, 1], one possible answer is [2, 3, 1, 3, 1, 2].

Note:
You may assume all input has valid answer.

Follow Up:
Can you do it in O(n) time and/or in-place with O(1) extra space?

"""


class WiggleSortII:
    """Reorder an array based on the above requirements."""

    def wiggle_sort(self, nums):
        """Reorder a given array and return the wiggle sorted one.

        The algorithm first sort the input array, and then fill the odd index
        with tail of the sorted array, and fill the even index with the rest
        tail of the sorted array.

        Args:
            nums (list): The input list.
        Returns:
            nums (list): Reordered the in-place list.
        """
        sorted_nums = sorted(nums)
        for i in list(range(1, len(nums), 2)) + list(range(0, len(nums), 2)):
            nums[i] = sorted_nums.pop()
        return nums
