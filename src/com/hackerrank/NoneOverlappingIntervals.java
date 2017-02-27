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

package com.hackerrank;

import java.util.Arrays;

/**
 * Created by Leon on 2/26/17.
 * #435 (Medium)
 *
 * https://leetcode.com/problems/non-overlapping-intervals/?tab=Description
 *
 * Given a collection of intervals, find the minimum number of intervals you
 * need to remove to make the rest of the intervals non-overlapping.
 *
 * Notes:
 *   1. You may assume the interval's end point is always bigger than its start
 *   point.
 *   2. Intervals like [1,2] and [2,3] have borders "touching" but they don't
 *   overlap each other.
 *
 * Example 1:
 *   Input: [ [1,2], [2,3], [3,4], [1,3] ]
 *   Output: 1
 *   Explanation: [1,3] can be removed and the rest of intervals are
 *   non-overlapping.
 *
 * Examples 2:
 *   Input: [ [1,2], [1,2], [1,2] ]
 *   Output: 2
 *   Explanation: You need to remove two [1,2] to make the rest of intervals
 *   non-overlapping.
 *
 * Examples 3:
 *   Input: [ [1,2], [2,3] ]
 *   Output: 0
 *   Explanation: You don't need to remove any of the intervals since they're
 *   already non-overlapping.
 */

public class NoneOverlappingIntervals {
    private int count = 0;
    private int j = 0;

    public int eraseOverlapIntervals(Interval[] intervals) {
        Arrays.sort(intervals, (x, y)->(x.start)-(y.start));
        for(int i = 1; i < intervals.length; i++) {
            if(intervals[j].end > intervals[i].start){
                j = intervals[i].end < intervals[j].end ? i:j;
                count++;
            } else {
                j = 1;
            }
        }
        return count;
    }
}
