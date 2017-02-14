/*
 *  Copyright (c) 2017.  Leon Lee <leon.lee@berkeley.edu>
 *  Permission is hereby granted, free of charge, to any person obtaining a copy of
 *  this software and associated documentation files (the "Software"), to deal in
 *  the Software without restriction, including without limitation the rights to
 *  use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 *  the Software, and to permit persons to whom the Software is furnished to do so,
 *  subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 *  FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 *  COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 *  IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 *  CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.leetcode;

/**
 * Created by Leon on 2/14/17.
 * Equal (https://www.hackerrank.com/challenges/equal, Medium)
 * Christy is interning at HackerRank. One day she has to distribute some
 * chocolates to her colleagues. She is biased towards her friends and may have
 * distributed the chocolates unequally. One of the program managers gets to
 * know this and orders Christy to make sure everyone gets equal number of
 * chocolates.
 *
 * But to make things difficult for the intern, she is ordered to equalize the
 * number of chocolates for every colleague in the following manner,
 *
 * For every operation, she can choose one of her colleagues and can do one of
 * the three things.
 *
 * 1. She can give one chocolate to every colleague other than chosen one.
 * 2. She can give two chocolates to every colleague other than chosen one.
 * 3. She can give five chocolates to every colleague other than chosen one.
 *
 * Calculate minimum number of such operations needed to ensure that every
 * colleague has the same number of chocolates.
 *
 * Input Format
 *
 * 1 <= T <= 100
 * 1 <= N <= 10000
 * Number of initial chocolates each colleague has < 1000
 *
 * Output Format
 *
 * T lines, each containing the minimum number of operations needed to make
 * sure all colleagues have the same number of chocolates,
 *
 * Sample Input
 *
 * 1
 * 4
 * 2 2 3 7
 *
 * Sample Output
 *
 * 2
 *
 * Explanation
 *
 * 1st operation: Christy increases all elements by 1 except 3rd one
 * 2 2 3 7 -> 3 3 3 8
 * 2nd operation: Christy increases all element by 5 except last one
 * 3 3 3 8 -> 8 8 8 8


 */
public class Euqal {
}
