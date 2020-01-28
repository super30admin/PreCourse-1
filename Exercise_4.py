# Python program to insert element in binary tree  
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp):
    if temp is None:    # base case
        return
    inorder(temp.left)  # first recursive call on left tree
    print(temp.key)     # print the value of current node
    inorder(temp.right) # second recursive call on right tree
  
  
"""function to insert element in binary tree """
def insert(temp,key):

    queue = [temp]  # could use deque from collections but have to import extra library and so avoided it.

    if temp is None:  # tree doesn't exist and so nothing to insert
        return

    while (len(queue) > 0):
        # a normal bfs traversal and checking empty place in parallel.
        currNode = queue.pop(0)

        if currNode.left is None:   # check for left node being empty
            currNode.left = newNode(key)
            break
        else:                       # otherwise just append to the queue
            queue.append(currNode.left)

        if currNode.right is None:  # check for right node being empty
            currNode.right = newNode(key)
            break
        else:                       # otherwise just append to the queue
            queue.append(currNode.right)


  
       
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
