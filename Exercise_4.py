# Python program to insert element in binary tree
# Problem at 71! Not sure why key 12 isn't showing up.
# The insert function is inserting it.

class newNode():

    def __init__(self, data):
        self.key = data
        self.left = None
        self.right = None


""" Inorder traversal of a binary tree"""
def inorder(temp):

    if not temp:
        # print("Tree Empty")
        return

    inorder(temp.left)
    print(temp.key)
    inorder(temp.right)


"""function to insert element in binary tree """
def insert(temp, key):

    queue = []
    queue.append(temp)

    while (queue):

        temp = queue[0]

        if temp.left == None:
            temp.left = newNode(key)
            break
        else:
            #print(temp.left.key)
            queue.append(temp.left)

        if temp.right == None:
            temp.right == newNode(key)
            break
        else:
            #print(temp.right.key)
            queue.append(temp.right)

        queue.pop(0)





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
