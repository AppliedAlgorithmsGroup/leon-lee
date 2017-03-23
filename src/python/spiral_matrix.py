# -*- coding: utf-8 -*-
"""#54 Spiral Matrix (Medium).

(https://leetcode.com/problems/spiral-matrix/#/description)

Given a matrix of m x n elements (m rows, n columns), return all elements of
the matrix in spiral order.

For example, given the following matrix:

[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]

You should return [1,2,3,6,9,8,7,4,5].

"""


class SpiralMatrix:
    """Return spiral ordered matrix."""

    def reorder_matrix(self, matrix):
        """Return spiral ordered matrix.

        Args:
            matrix (list): Input matrix.
        Returns:
            result (list): Spiral result.
        """
        if not len(matrix):
            return []
        length = len(matrix)
        m = len(matrix[0])
        if m == 0:
            return []
        r, l = 0, 0
        length -= 1
        m -= 1
        ans = []
        while r <= m and l <= length:
            for i in range(r, m + 1):
                ans.append(matrix[l][i])
            l += 1
            if l > length:
                break
            for i in range(l, length + 1):
                ans.append(matrix[i][m])
            m -= 1
            i = m
            if m < r:
                break
            while i >= r:
                ans.append(matrix[length][i])
                i -= 1
            length -= 1
            i = length
            if length < l:
                break
            while i >= l:
                ans.append(matrix[i][r])
                i -= 1
            r += 1
        return ans
