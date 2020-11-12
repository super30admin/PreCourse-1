# Python program to insert element in binary tree
class newNode():

    def __init__(self, data):
        self.key = data
        self.left = None
        self.right = None


""" Inorder traversal of a binary tree"""


def inorder(temp):
    if temp.left is not None:
        inorder(temp.left)
    print(temp.key)
    if temp.right is not None:
        inorder(temp.right)


"""function to insert element in binary tree """


def insert(temp, key):
    insertHelper(temp, key, [])


def insertHelper(temp, key, queue):
    # level order traversal
    if temp is None:
        return

    # print(temp.key)

    if temp.left is not None:
        queue.append(temp.left)
    else:
        temp.left = newNode(key)
        return

    if temp.right is not None:
        queue.append(temp.right)
    else:
        temp.right = newNode(key)
        return

    if queue:
        temp = queue.pop(0)
    else:
        temp = None
    insertHelper(temp, key, queue)


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
    print("insert called.")
    insert(root, key)

    print()
    print("Inorder traversal after insertion:", end=" ")
    inorder(root)
