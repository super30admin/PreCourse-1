from collections import deque
# Python program to insert element in binary tree  
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(root):
    if(root):
        inorder(root.left)
        print(root.key, end =" ")
        inorder(root.right)
  
"""function to insert element in binary tree """
def insert(root,key):
    if root is None:
        root = newNode(key)
        return
    q = deque([root])
    while(q):
        curr = q.popleft()
        if(curr.left is None):
            curr.left = newNode(key)
            break
        else:
            q.append(root.left)
        if(curr.right is None):
            curr.right = newNode(key)
            break
        else:
            q.append(curr.right)
       
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
