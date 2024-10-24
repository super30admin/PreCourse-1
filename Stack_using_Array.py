import unittest
from collections import deque
from typing import Optional


# Define the TreeNode class
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


# Define the Solution class with the widthOfBinaryTree method
class Solution:
    def widthOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0

        queue = deque([(root, 0)])
        max_width = 0

        while queue:
            level_length = len(queue)
            _, level_start = queue[0]

            for i in range(level_length):
                node, index = queue.popleft()

                if node.left:
                    queue.append((node.left, 2 * index))

                if node.right:
                    queue.append((node.right, 2 * index + 1))

            max_width = max(max_width, index - level_start + 1)

        return max_width


# Test cases
class TestWidthOfBinaryTree(unittest.TestCase):

    def test_empty_tree(self):
        solution = Solution()
        self.assertEqual(solution.widthOfBinaryTree(None), 0)

    def test_single_node_tree(self):
        solution = Solution()
        root= TreeNode(1)
        self.assertEqual(solution.widthOfBinaryTree(root), 1)

    def test_full_binary_tree(self):
        solution = Solution()
        # Creating the following tree:
        #        1
        #       / \
        #      2   3
        #     / \ / \
        #    4  5 6  7
        root = TreeNode(1)
        root.left = TreeNode(2)
        root.right = TreeNode(3)
        root.left.left = TreeNode(4)
        root.left.right = TreeNode(5)
        root.right.left = TreeNode(6)
        root.right.right = TreeNode(7)
        self.assertEqual(solution.widthOfBinaryTree(root), 4)

    def test_skewed_tree(self):
        solution = Solution()
        # Creating the following tree:
        #       1
        #      /
        #     2
        #    /
        #   3
        #  /
        # 4
        root = TreeNode(1)
        root.left = TreeNode(2)
        root.left.left = TreeNode(3)
        root.left.left.left = TreeNode(4)
        self.assertEqual(solution.widthOfBinaryTree(root), 1)

    def test_incomplete_binary_tree(self):
        solution = Solution()
        # Creating the following tree:
        #        1
        #       / \
        #      2   3
        #       \    \
        #        5    9
        #       /      \
        #      6        7
        root = TreeNode(1)
        root.left = TreeNode(2)
        root.right = TreeNode(3)
        root.left.right = TreeNode(5)
        root.left.right.left = TreeNode(6)
        root.right.right = TreeNode(9)
        root.right.right.right = TreeNode(7)

        # Corrected expected value is 4 instead of 7
        self.assertEqual(solution.widthOfBinaryTree(root), 6)


if __name__ == "__main__":
    unittest.main()
