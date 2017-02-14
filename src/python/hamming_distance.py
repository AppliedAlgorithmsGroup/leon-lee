# -*- coding: utf-8 -*-
"""#461 Hamming Distance (Easy).

The Hamming distance between two integers is the number of positions at which
the corresponding bits are different. Original link on leetcode:
https://leetcode.com/problems/hamming-distance/.

Given two integers x and y, calculate the Hamming distance.

Note: 0 ≤ x, y < 2^31.
Example:
Input: x = 1, y = 4
Output: 2

Explanation:
  1   (0 0 0 1)
  4   (0 1 0 0)
  ↑   ↑

The above arrows point to positions where the corresponding bits are different.

Examples:
    hamming_distance = HammingDistance()

    distance = hamming_distance.calculate_distance(1, 4)

    The above variable distance should be 1.

Todo:
    * Algorithm complexity analysis

"""
import math


class HammingDistance:
    """Calculate Hamming Distance between two integers.

    Calculate Hamming Distance, which is the number of positions at which
    the corresponding bits are different.
    """

    def __init__(self):
        """Initiate tow int numbers and both are assigned values of 0."""
        self.number_a = 0
        self.number_b = 0

    def calculate_distance(self, number_a, number_b):
        """Calculate hamming distance and return different bits.

        Calculate Hamming Distance of two integers. If any integer is less
        than 0 or greater or equals than 231, return error code -1.

        Args:
            number_a (int): A integer number.
            number_b (int): Another integer number.

        Returns:
            result (int): The different bits or -1 when integers exceed range.
        """
        self.number_a = number_a
        self.number_b = number_b
        max_number = math.pow(2, 31)
        if (self.number_a < 0 or self.number_a >= max_number or
                self.number_b < 0 or self.number_b >= max_number):
            return -1
        xor_result = int(self.number_a) ^ int(self.number_b)
        return bin(xor_result).count("1")
