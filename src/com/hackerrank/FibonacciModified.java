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

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Leon on 2/14/17.
 * Fibonacci Modified (https://www.hackerrank
 * .com/challenges/fibonacci-modified, Medium)
 *
 * We define a modified Fibonacci sequence using the following definition:
 *
 * Given terms t(i) and t(i+1) where i belongs to [1, infinite), term t(i+2) is
 * computed using the following relation:
 *     t(i+2) = t(i) + t(i+1)^2
 *
 * For example, if term t(1)=0 and t(2)=1, term t(3)=0+1^2=1, term t(4)=1+1^2=2,
 * term t(5)= 1+2^2=5, and so on.
 *
 * Given three integers,t(1), t(2), and n, compute and print term t(n）of a
 * modified Fibonacci sequence.
 *
 * Note: The value of t(n) may far exceed the range of a 64-bit integer. Many
 * submission languages have libraries that can handle such large results but,
 * for those that don't (e.g., C++), you will need to be more creative in your
 * solution to compensate for the limitations of your chosen submission language.
 *
 * Input Format:
 *
 * A single line of three space-separated integers describing the respective
 * values of t(1), t(2), and n.
 *
 * Constrains:
 *   0<=t(1), t(2)<=2
 *   3<= n <=20
 *   t(n) may far exceed the range of a 64-bit integer.
 *
 * Output Format:
 *
 * Print a single integer denoting the value of term t(n) in the modified
 * Fibonacci sequence where the first two terms are t(1) and t(2).
 *
 * Sample Input:
 *
 *   0 1 5
 *
 * Sample Outputs:
 *
 *   5
 *
 * Explanation:
 *
 * The first two terms of the sequence are t(1)=0 and t(2) = 1, which gives
 * us a modified Fibonacci sequence of {0,1,1,2,5,27,...}. Because n=5, we
 * print term t(5), which is 5.
 */
public class FibonacciModified {
    private BigInteger numberT1;
    private BigInteger numberT2;
    private BigInteger tmpNumbe;
    private int numberN;

    public FibonacciModified(int numberT1, int numberT2, int numberN) {
        if (0 <= numberT1 && numberT1 <= 2 && 0 <= numberT2 && numberT2 <= 2
                && 3 <= numberN && numberN <= 20) {
            this.numberT1 = BigInteger.valueOf(numberT1);
            this.numberT2 = BigInteger.valueOf(numberT2);
            this.numberN = numberN;
        } else {
            throw new IllegalArgumentException("The input values error.");
        }
    }

    public BigInteger calculateModifiedFibonacci() {
        numberN--;
        if (numberN != 0) {
            tmpNumbe = numberT2;
            numberT2 = numberT1.add(numberT2.multiply(numberT2));
            numberT1 = tmpNumbe;
            calculateModifiedFibonacci();
        }
        return numberT1;
    }
}
