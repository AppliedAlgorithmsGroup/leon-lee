from python.binary_tree_zigzag_level_order_traversal import TreeNode, \
    BinaryTreeZigZagLevelOrderTraversal


def zigzag_level_order_traversal_test():
    tree_node = TreeNode(3)
    tree_node.left = TreeNode(9)
    tree_node.right = TreeNode(20)
    tree_node.right.left = TreeNode(15)
    tree_node.right.right = TreeNode(7)

    zigzag = BinaryTreeZigZagLevelOrderTraversal()
    assert zigzag.zigzag_level_order(tree_node) == [[3], [20, 9], [15, 7]]
