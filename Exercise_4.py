# Python program to insert element in binary tree  
class newNode():

    def __init__(self, data):
        self.key = data
        self.left = None
        self.right = None


""" Inorder traversal of a binary tree"""


def inorder(temp):
    current = temp
    stack = []
    while stack or current:
        if current:
            stack.append(current)
            current = current.left
        else:
            current = stack.pop()
            print(current.key)
            current = current.right


def inorderRecursive(temp):
    if temp:
        inorderRecursive(temp.left)
        print(temp.key)
        inorderRecursive(temp.right)


"""function to insert element in binary tree """


def insert(temp, key):
    cur = temp
    while cur.right:
        cur = cur.right
    cur.right = newNode(key)


# Driver code
if __name__ == '__main__':
    root = newNode(10)
    root.left = newNode(11)
    root.left.left = newNode(7)
    root.right = newNode(9)
    root.right.left = newNode(15)
    root.right.right = newNode(8)

    print("Inorder traversal before insertion ITERATIVE:")
    inorder(root)
    print("Inorder traversal before insertion RECURSIVE:")
    inorderRecursive(root)

    key = 12
    insert(root, key)

    print()
    print("Inorder traversal after insertion:")
    inorder(root)
