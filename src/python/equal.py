# -*- coding: utf-8 -*-
"""Equal (https://www.hackerrank.com/challenges/equal, Medium).

Christy is interning at HackerRank. One day she has to distribute some
chocolates to her colleagues. She is biased towards her friends and may have
distributed the chocolates unequally. One of the program managers gets to
know this and orders Christy to make sure everyone gets equal number of
chocolates.

But to make things difficult for the intern, she is ordered to equalize the
number of chocolates for every colleague in the following manner,

For every operation, she can choose one of her colleagues and can do one of
the three things.

1. She can give one chocolate to every colleague other than chosen one.
2. She can give two chocolates to every colleague other than chosen one.
3. She can give five chocolates to every colleague other than chosen one.

Calculate minimum number of such operations needed to ensure that every
colleague has the same number of chocolates.

Input Format

1 <= T <= 100
1 <= N <= 10000
Number of initial chocolates each colleague has < 1000

Output Format

T lines, each containing the minimum number of operations needed to make
sure all colleagues have the same number of chocolates,

Sample Input

1
4
2 2 3 7

Sample Output

2

Explanation

1st operation: Christy increases all elements by 1 except 3rd one
2 2 3 7 -> 3 3 3 8
2nd operation: Christy increases all element by 5 except last one
3 3 3 8 -> 8 8 8 8
"""


class Equal:
    """Calculate minimum number of steps to make all elements equal.

    Calculate minimum steps and return the steps value.
    """

    @staticmethod
    def count_mim_steps(array_a):
        """Find the minimum steps and return the steps.

        The original three criteria is to hold one value and move the others
        either 1, 2, or 5 steps. Actually we can solve the problem by
        thinking in the reverse way, which is to hold the other elements and
        move only one -1, -2, or -5 steps.

        Based on the above assumption, this problem can be re-described as:
        Given an array, find the minimum steps that make all elements even by
        subtracting only element 1, 2 or 5 at one time. At first glance,
        we may think that the goal is to make all elements to the min
        element. But further reflection would reveal that it may not be the
        minimum steps since there is probability that the steps that all
        elements are moved to a number smaller than the min element are
        smaller than steps that all elements are moved to the min element. So my
        algorithm choose the min steps among those that move elements to the
        range of (min_element -5, min_element).

        Why choose this range? The reason is steps of making all elements to (
        min_element-6) are n*5 grater than steps of making all elements to (
        min_element-1), and the same for (min_element-7), etc. So we do not
        need to consider elements that are less than element-5, just looping
        among (min_element-6, min_element).

        Args:
            array_a (list): The original input list.

        Results:
            result (int): Minimum step to make the elements even.
        """
        min_value = min(array_a)
        shift_left_array = [(min_value + i) for i in range(-5, 0)]
        shift_left_array.append(min_value)
        steps = []
        for element_i in shift_left_array:
            tempt = 0
            for element_j in array_a:
                delta = element_j - element_i
                tempt += int(delta / 5) + int(delta % 5 / 2) + delta % 5 % 2
            steps.append(tempt)
        return min(steps)
