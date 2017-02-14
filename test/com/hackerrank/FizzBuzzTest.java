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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertTrue;

/*
* FizzBuzz Tester. 
* 
* @author <Leon Lee> 
* @since <pre>Feb 6, 2017</pre> 
* @version 1.0 
*/ 
public class FizzBuzzTest { 

    @Before
    public void before() throws Exception { 
    } 

    @After
    public void after() throws Exception { 
    } 

    /*
    * 
    * Method: fizzBuzz(int numberN) 
    * 
    */ 
    @Test
    public void inputNumberTwoTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String > stringList = new ArrayList();
        stringList.add(0, "1");
        stringList.add(1, "2");
        assertTrue(stringList.equals(fizzBuzz.fizzBuzz(2)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void illegalInputArgumentTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.fizzBuzz(-1);
    }

    @Test
    public void inputNumberFifteenTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> stringList = new ArrayList(Arrays.asList("1", "2", "Fizz",
                "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz",
                "13", "14", "FizzBuzz"));
        assertTrue(stringList.equals(fizzBuzz.fizzBuzz(15)));
    }
}
