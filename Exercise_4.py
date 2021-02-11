# Python program to insert element in binary tree  
class newNode():

    def __init__(self, data):
        self.key = data
        self.left = None
        self.right = None


""" Inorder traversal of a binary tree"""
def inorder(temp):
    inorder_list = []
    if temp:
        inorder_list = inorder(temp.left)
        inorder_list.append(temp.key)
        inorder_list = inorder_list + inorder(temp.right)
    return inorder_list


"""function to insert element in binary tree """
def insert(temp, key):
    if temp is None:
        temp = newNode(key)
    else:
        # Compare incoming value with root
        if key > temp.key:
            if temp.right is None:
                temp.right = newNode(key)
            else:
                insert(temp.right, key)
        else:
            if root.left is None:
                root.left = newNode(key)
            else:
                insert(temp.left, key)


# Driver code  
if __name__ == '__main__':
    root = newNode(10)
    root.left = newNode(11)
    root.left.left = newNode(7)
    root.right = newNode(9)
    root.right.left = newNode(15)
    root.right.right = newNode(8)

    print("Inorder traversal before insertion:", end=" ")
    lst = inorder(root)
    print(lst)

    key = 12
    insert(root, key)

    print()
    print("Inorder traversal after insertion:", end=" ")
    lst = inorder(root)
    print(lst)
