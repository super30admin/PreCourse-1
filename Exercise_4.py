# Python program to insert element in binary tree
class newNode():

    def __init__(self, data):
        self.key = data
        self.left = None
        self.right = None


""" Inorder traversal of a binary tree"""


def inorder(temp):
    if(temp is None):
        return
    else:
        inorder(temp.left)
        print(temp.key, end=",")
        inorder(temp.right)


"""function to insert element in binary tree """


def insert(temp, key):
    if temp is None:
        new_Node = newNode(key)
        return
    queue = []
    queue.append(temp)
    while(len(queue) > 0):
        element = queue.pop(0)
        ""
        "Checking if the left child is Null, if yes then we can insert"
        ""
        if(element.left is None):
            element.left = newNode(key)
            break
        else:
            ""
            "If left child is not empty, add it to the queue for checking later "
            ""
            queue.append(element.left)
        if(element.right is None):
            ""
            "Checking if the right child is Null, if yes then we can insert"
            ""
            element.right = newNode(key)
            break
        else:
            ""
            "Since right child is not empty, we add it to the queue to check later"
            ""
            queue.append(element.right)


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
