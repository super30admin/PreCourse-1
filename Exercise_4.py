# Time Complexity : inorder O(N)  , insert O(N)
# Space Complexity : O(N) : number of elements
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
"""
1. inorder: calling inprder function recursively to traverse left tree , print the parent node then Recursively calling right subtree
2. insert : if no root , make new element as root else follow BFS approach and find first Available location to insert new element

"""


# Python program to insert element in binary tree
class newNode():

    def __init__(self, data):
        self.key = data
        self.left = None
        self.right = None


""" Inorder traversal of a binary tree"""


def inorder(temp):
    if temp == None:
        return
    inorder(temp.left)
    print(temp.key)
    inorder(temp.right)


"""function to insert element in binary tree """


def insert(temp, key):
    if not temp:
        temp = newNode(key)
        return

    queue = []
    queue.append(temp)

    while len(queue):
        node = queue.pop(0)

        if node.left == None:
            node.left = newNode(key)
            return
        if node.right == None:
            node.right = newNode(key)
            return
        if node.left:
            queue.append(node.left)
        if node.right:
            queue.append(node.right)


# Driver code
if __name__ == '__main__':
    root = newNode(10)
    root.left = newNode(11)
    root.left.left = newNode(7)
    root.right = newNode(9)
    root.right.left = newNode(15)
    root.right.right = newNode(8)

    print("Inorder traversal before insertion:", end = " ")
    inorder(root)

    key = 12
    insert(root, key)

    print()
    print("Inorder traversal after insertion:", end = " ")
    inorder(root) 
