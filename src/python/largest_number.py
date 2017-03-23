# -*- coding: utf-8 -*-
"""#179 Largest Number (Medium).

(https://leetcode.com/problems/largest-number/#/description)

Given a list of non negative integers, arrange them such that they form the
largest number.

For example, given [3, 30, 34, 5, 9], the largest formed number is 9534330.

Note: The result may be very large, so you need to return a string instead of
an integer.

"""

import functools


class LargestNumber:
    """Return the largest number based on the element of the list."""

    def arrange_largest_number(self, nums):
        """Return the largest combination number in a given list.

        Args:
            nums (list): Input list
        Returns:
            result (string): Re-arrange result based on the above criteria.
        """
        nums = [str(x) for x in nums]
        nums = sorted(nums, key=functools.cmp_to_key(self._compare))
        return ''.join(nums).lstrip('0') or 0

    def _compare(self, a, b):
        """Compare two strings.

        Args:
            a (string): String a.
            b (String): String b.
        Returns:
            result (int): return 1 if a +b > b + a, else -1.

        """
        return [1, -1][a + b > b + a]
