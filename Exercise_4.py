# Time Complexity:
# Space Complexity:
# Did this code successfully run on Leetcode: Executed in PyCharm
# Any problem you faced while coding this: Understanding time and space complexity
# Python program to insert element in binary tree
class newNode():

    def __init__(self, data):
        self.key = data
        self.left = None
        self.right = None


""" Inorder traversal of a binary tree"""


def inorder(temp):
    if temp is None:
        return None
    inorder(temp.left)
    print(temp.key)
    inorder(temp.right)


"""function to insert element in binary tree """


def insert(temp, key):
    if temp is None:
        temp = newNode(key)
    queue = []
    queue.append(temp)
    while len(queue) != 0:
        current = queue.pop(0)
        if current.left is None:
            current.left = newNode(key)
            return
        else:
            queue.append(current.left)

        if current.right is None:
            current.right = newNode(key)
            return
        else:
            queue.append(current.right)


# Driver code
if __name__ == '__main__':
    root = newNode(10)
    root.left = newNode(11)
    root.left.left = newNode(7)
    root.right = newNode(9)
    root.right.left = newNode(15)
    root.right.right = newNode(8)

    print("Inorder traversal before insertion:\n", end=" ")
    inorder(root)

    key = 12
    insert(root, key)

    print()
    print("Inorder traversal after insertion:\n", end=" ")
    inorder(root)
