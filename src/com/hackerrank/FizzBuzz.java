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

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Leon on 2/6/17.
 * #412 Fizz Buzz (Easy)
 *
 * Write a program that outputs the string representation of numbers from 1 to n.
 *
 * But for multiples of three it should output “Fizz” instead of the number and
 * for the multiples of five output “Buzz”. For numbers which are multiples of
 * both three and five output “FizzBuzz”.
 *
 * Examples:
 *   n = 15;
 *   Return:
 *     [
 *       "1",
 *       "2",
 *       "Fizz",
 *       "4",
 *       "Buzz",
 *       "Fizz",
 *       "7",
 *       "8",
 *       "Fizz",
 *       "Buzz",
 *       "11",
 *       "Fizz",
 *       "13",
 *       "14",
 *       "FizzBuzz"
 *     ]
 */
public class FizzBuzz {
    public List<String> fizzBuzz(int numberN) throws IllegalArgumentException {
        if (numberN <= 0)
            throw new IllegalArgumentException("Number should be bigger than " +
                    "0.");
        List<String > stringList = new ArrayList<>();
        for (int i = 0; i < numberN; i++) {
            if ( (i + 1) % 15 == 0) stringList.add(i, "FizzBuzz");
            else if ( (i + 1) % 3 == 0) stringList.add(i, "Fizz");
            else if ( (i + 1) % 5 == 0) stringList.add(i, "Buzz");
            else stringList.add(i, Integer.toString(i + 1));
        }
        return stringList;
    }
}