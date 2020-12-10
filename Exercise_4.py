# Python program to insert element in binary tree
#Exercise_4 : Insert an element in a Binary Tree.
class newNode():

    def __init__(self, data):
        self.key = data
        self.left = None
        self.right = None

""" Inorder traversal of a binary tree"""
def inorder(temp):
    if temp:
        inorder(temp.left)
        print(temp.key, end=" ")
        inorder(temp.right)



"""function to insert element in binary tree """
def insert(temp,key):
    if not temp:
        root = newNode(key)
        return

    queue = [temp]

    while queue:
        curr = queue.pop(0)

        if not curr.left: #no left child
            curr.left = newNode(key)
            break
        else:
            queue.append(curr.left)

        if not curr.right: #no right child
            curr.right = newNode(key)
            break
        else:
            queue.append(curr.right)



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
