# Python program to insert element in binary tree  
class newNode():

    def __init__(self, data):
        self.key = data
        self.left = None
        self.right = None


""" Inorder traversal of a binary tree"""


def inorder(temp):
    elements = []

    def add(temp, elements):
        if temp.left:
            add(temp.left, elements)
        elements.append(temp.key)
        if temp.right:
            add(temp.right, elements)
        return elements

    return add(temp, elements)


"""function to insert element in binary tree """


def insert(temp, key):
    prev_val = temp
    if temp.right:
        insert(temp.right, key)
    if temp.right is None:
        prev_val.left = newNode(key)


# Driver code
if __name__ == '__main__':
    root = newNode(10)
    root.left = newNode(11)
    root.left.left = newNode(7)
    root.right = newNode(9)
    root.right.left = newNode(15)
    root.right.right = newNode(8)
    print(root.left)
    print("Inorder traversal before insertion:")
    print(inorder(root))

    key = 12
    insert(root, key)

    print()
    print("Inorder traversal after insertion:")
    print(inorder(root))
