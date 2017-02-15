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

import org.junit.Test;

import java.math.BigInteger;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Leon on 2/14/17.
 */
public class FibonacciModifiedTest {
    @Test
    public void zeroOneFiveShouldOutputFive() {
        FibonacciModified fibonacciModified = new FibonacciModified(0, 1, 5);
        assertEquals(BigInteger.valueOf(5), fibonacciModified
                .calculateModifiedFibonacci());
    }

    @Test
    public void bigOutputTest() {
        FibonacciModified fibonacciModified = new FibonacciModified(0, 1,
                10);
        String stringNumber = "84266613096281243382112";
        assertEquals(new BigInteger(stringNumber), fibonacciModified
                .calculateModifiedFibonacci());
    }

    @Test(expected = IllegalArgumentException.class)
    public void minusOneAndTwoAndFiveShouldThrowException() {
        FibonacciModified fibonacciModified = new FibonacciModified(-1, 2,
                5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void OneAndTwoAndTwoShouldThrowException() {
        FibonacciModified fibonacciModified = new FibonacciModified(-1, 2,
                2);
    }
}
