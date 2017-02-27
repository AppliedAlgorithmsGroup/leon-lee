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

/**
 * Created by Leon on 2/26/17.
 * #513 Find Bottom Left Tree Value (Medium)
 *
 * Given a binary tree, find the leftmost value in the last row of the tree.
 *
 * Example 1:
 *
 * Input:
 *
 *   2
 *  / \
 * 1   3
 *
 * Output:
 *
 * 1
 *
 * Examples 2:
 *
 * Input:
 *
 *     1
 *    / \
 *   2   3
 *  /   / \
 * 4   5   6
 *    /
 *   7
 *
 * Output:
 *
 * 7
 */


public class FindBottomLeftTreeValue {
    private int result = 0;
    private int height = 0;

    public int findBottomLeftValue(TreeNode root) {
        traverseTree(root, 1);
        return result;
    }

    private void traverseTree(TreeNode root, int depth) {
        if (root == null) return;

        if (height < depth) {
            result = root.val;
            height = depth;
        }

        traverseTree(root.left, depth + 1);
        traverseTree(root.right, depth + 1);
    }
}
