 # Time Complexity : push O(1) pop O(1) overall O(1)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode :not checked yet
# Any problem you faced while coding this :
# binary tree  means node will have 2 child.
#insert start with left child then right child
# insert 1
#insert 2
#      1
#    /
#   2
#insert 3
#      1
#    /  \
#   2    3
# Python program to insert element in binary tree
class newNode():

    def __init__(self, data):
        self.key = data
        self.left = None
        self.right = None

""" Inorder traversal of a binary tree"""
#inorder means left node right
def inorder(temp):
    if (not temp):
        return
    inorder(temp.left)
    print(temp.key)
    inorder(temp.right)



"""function to insert element in binary tree """
def insert(temp,key):
    if not temp:
        root = newNode(key)
        return
    q = []
    q.append(temp)# adding root into list
    #print(len(q))

    while (len(q)): # until list have element
        tempNode = q[0]
        q.pop(0)
        #checking node has left child or not
        # if not means adding key to left other wise adding node to list
        if (not tempNode.left):
            tempNode.left = newNode(key)
            break
        else:
            q.append(tempNode.left)
        # same with right child
        if (not tempNode.right):
            tempNode.right = newNode(key)
            break
        else:
            q.append(tempNode.right)


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
