# -*- coding: utf-8 -*-
r"""#103 Binary Tree ZigZag Level Order Traversal.

(https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/?tab
=Description, Medium)

Given a binary tree, return the zigzag level order traversal of its nodes'
values. (ie, from left to right, then right to left for the next level and
alternate between).

For example:

Given binary tree [3,9,20,null,null,15,7].

return its zigzag level order traversal as:

[[3], [20,9], [15,7]]
"""


class TreeNode(object):
    """Definition of Tree Node."""

    def __init__(self, x):
        """Init a binary tree object."""
        self.val = x
        self.left = None
        self.right = None


class BinaryTreeZigZagLevelOrderTraversal(object):
    """Traversal tree node and return zigzag level values."""

    def __init__(self):
        """Constructor, initializing results list to store zigzag values."""
        self.results = []

    def pre_order(self, root, level, res):
        """Traversal tree node output zigzag values.

        Args:
            root (TreeNode): root node.
            level (int): level of the current node.
            res (list): previous zigzag values.
        """
        if root:
            if len(res) < level+1:
                res.append([])
            if level % 2 == 0:
                res[level].append(root.val)
            else:
                res[level].insert(0, root.val)
            self.pre_order(root.left, level+1, res)
            self.pre_order(root.right, level+1, res)

    def zigzag_level_order(self, root):
        """Traversal tree node, return zigzag values.

        Args:
            root (TreeNode): root node of a binary tree.

        Returns:
            results (list): zigzag values.
        """
        self.pre_order(root, 0, self.results)
        return self.results
