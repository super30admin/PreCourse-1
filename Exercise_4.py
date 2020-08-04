# Python program to insert element in binary tree

# Iterative approach
class newNode():

    def __init__(self, data):
        self.key = data
        self.left = None
        self.right = None

""" Inorder traversal of a binary tree"""
def inorder(temp):

    if temp is None:
        return

    inorder(temp.left)
    print(temp.key)
    inorder(temp.right)




"""function to insert element in binary tree """
def insert(temp,key):

    element=newNode(key)

    if  temp is None:
        return element

    curr=temp
    parent=None

    while curr is not None:
        parent=curr
        if curr.key>key:
            curr=curr.left
        else:
            curr=curr.right

    if parent.key>key:
        parent.left=element
    else:
        parent.right=element


# Driver code
if __name__ == '__main__':
    root = newNode(100)
    root.left = newNode(20)
    root.left.left = newNode(10)
    root.left.right = newNode(30)

    root.right = newNode(500)


    print("Inorder traversal before insertion:", end = " ")
    inorder(root)

    key = 40
    insert(root, key)

    print()
    print("Inorder traversal after insertion:", end = " ")
    inorder(root)

    key = 5
    insert(root, key)

    print()
    print("Inorder traversal after insertion:", end = " ")
    inorder(root)
