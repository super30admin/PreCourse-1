# Python program to insert element in binary tree
from collections import deque


class newNode():

    def __init__(self, data):
        self.key = data
        self.left = None
        self.right = None


""" Inorder traversal of a binary tree"""


def inorder(temp):
    curr = temp
    if curr.left is not None:
        inorder(curr.left)
    print(curr.key)
    if curr.right is not None:
        inorder(curr.right)


"""function to insert element in binary tree """


def insert(temp, key):
    new_node = newNode(key)
    # BFS traversal, insert on finding first empty spot
    q = deque([temp])
    while q:
        node = q.popleft()
        if node.left:
            q.append(node.left)
        if not node.left:
            node.left = new_node
            break
        if node.right:
            q.append(node.right)
        if not node.right:
            node.right = new_node
            break


# Driver code
if __name__ == '__main__':
    root = newNode(10)
    root.left = newNode(11)
    root.left.left = newNode(7)
    root.right = newNode(9)
    root.right.left = newNode(15)
    root.right.right = newNode(8)

    print("Inorder traversal before insertion:", end=" ")
    inorder(root)

    key = 12
    insert(root, key)

    print()
    print("Inorder traversal after insertion:", end=" ")
    inorder(root)
