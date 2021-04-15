import collections
# Python program to insert element in binary tree

class newNode():
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp):

    # Inorder traversal is LDR - left data right traversal , this is a recursive method for inorder traversal
    if not temp:
        return
    inorder(temp.left)
    print(temp.key)
    inorder(temp.right)

"""function to insert element in binary tree """
def insert(temp,key):

    # Check the availability of leaf nodes for every node that is being traversed, if either of the leaf nodes is None, add the key's node as the child for insertion
    # if there is no root , add the tempas the root and
    if not temp:
        temp = newNode(key)
        return

    queue = collections.deque()
    queue.append(temp)
    while(len(queue)):

        elem = queue.popleft()
        # if there is
        if not elem.left:
           elem.left  = newNode(key)
           return
        else:
            queue.append(elem.left)

        if not elem.right:
            elem.right  = newNode(key)
            return
        else:
            queue.append(elem.right)



        # Driver code
if __name__ == '__main__': 
    root = newNode(10)
    root.left = newNode(11)  
    root.left.left = newNode(7)  
    root.right = newNode(9)  
    root.right.left = newNode(15)  
    root.right.right = newNode(8)  
    # Had to remove the end keyword that was not supported on my pyCharm
    print("Inorder traversal before insertion:"," ")
    inorder(root)  
  
    key = 12
    insert(root, key)  
  
    print("")
    print("Inorder traversal after insertion:", " ")
    inorder(root) 
'''
Output - 
('Inorder traversal before insertion:', ' ')
7
11
10
15
9
8

('Inorder traversal after insertion:', ' ')
7
11
12
10
15
9
8


'''