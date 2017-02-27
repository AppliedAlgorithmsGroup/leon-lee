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

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

import static junit.framework.TestCase.assertEquals;

/*
* NoneOverlappingIntervals Tester. 
* 
* @author <Leon Lee> 
* @since <pre>Feb 26, 2017</pre> 
* @version 1.0 
*/ 
public class NoneOverlappingIntervalsTest { 

    @Before
    public void before() throws Exception { 
    } 

    @After
    public void after() throws Exception { 
    } 

    @Test
    public void eraseOverlapIntervalsTestCaseOne() throws Exception {
        Interval[] intervals = new Interval[4];
        intervals[0] = new Interval(1, 2);
        intervals[1] = new Interval(2, 3);
        intervals[2] = new Interval(3, 4);
        intervals[3] = new Interval(1, 3);

        NoneOverlappingIntervals noneOverlappingIntervals = new
                NoneOverlappingIntervals();
        assertEquals(noneOverlappingIntervals.eraseOverlapIntervals(intervals)
                , 1);
    }

    @Test
    public void eraseOverlapIntervalsTestCaseTwo() {
        Interval[] intervalsB = new Interval[3];
        intervalsB[0] = new Interval(1, 2);
        intervalsB[1] = new Interval(1, 2);
        intervalsB[2] = new Interval(1, 2);
        NoneOverlappingIntervals noneOverlappingIntervals = new
                NoneOverlappingIntervals();
        assertEquals(noneOverlappingIntervals.eraseOverlapIntervals(intervalsB)
                    , 2);
    }

    @Test
    public void eraseOverlapIntervalsTestCaseThree() {
        Interval[] intervalsC = new Interval[2];
        intervalsC[0] = new Interval(1, 2);
        intervalsC[1] = new Interval(2, 3);
        NoneOverlappingIntervals noneOverlappingIntervals = new
                NoneOverlappingIntervals();
        assertEquals(noneOverlappingIntervals.eraseOverlapIntervals(intervalsC)
                , 0);
    }

}
