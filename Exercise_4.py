# Python program to insert element in binary tree

class newNode():

    def __init__(self, data):
        self.key = data
        self.left = None
        self.right = None


""" Inorder traversal of a binary tree"""


def inorder(temp):
    if temp:
        inorder(temp.left)
        print(temp.key)
        inorder(temp.right)
    else:
        return


"""function to insert element in binary tree """
# inserted in the level order from left to right to the first empty tree


def insert(temp, key):
    q = [temp]

    while len(q) > 0:
        temp = q.pop(0)

        if temp.left:
            q.append(temp.left)
        else:
            temp.left = newNode(key)
            break

        if temp.right:
            q.append(temp.right)
        else:
            temp.right = newNode(key)
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
