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
* FindBottomLeftTreeValue Tester. 
* 
* @author <Leon Lee> 
* @since <pre>Feb 26, 2017</pre> 
* @version 1.0 
*/ 
public class FindBottomLeftTreeValueTest { 

    @Before
    public void before() throws Exception { 
    } 

    @After
    public void after() throws Exception { 
    } 

    /*
    * 
    * Method: findBottomLeftValue(TreeNode root) 
    * 
    */ 
    @Test
    public void testFindBottomLeftValue() throws Exception {
        TreeNode treeNodeA = new TreeNode(2);
        treeNodeA.left = new TreeNode(1);
        treeNodeA.right = new TreeNode(3);

        TreeNode treeNodeB = new TreeNode(1);
        treeNodeB.left = new TreeNode(2);
        treeNodeB.right = new TreeNode(3);
        treeNodeB.left.left = new TreeNode(4);
        treeNodeB.right.left = new TreeNode(5);
        treeNodeB.right.right = new TreeNode(6);
        treeNodeB.right.left.left = new TreeNode(7);

        FindBottomLeftTreeValue findBottomLeftTreeValue = new
                FindBottomLeftTreeValue();
        assertEquals(findBottomLeftTreeValue.findBottomLeftValue(treeNodeA),
                1);
        assertEquals(findBottomLeftTreeValue.findBottomLeftValue(treeNodeB), 7);
    }

}
