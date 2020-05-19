# Python program to insert element in binary tree  
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp): 
    if not temp:
        return
    inorder(temp.left)
    print(temp.key)
    inorder(temp.right)
    
from collections import deque
  
"""function to insert element in binary tree """
def insert(temp,key):
    if not temp:
        return 
    helper = deque()
    helper.append(temp)
    while helper:
        node = helper.popleft()
        if node.left:
            helper.append(node.left)
        else:
            node.left = newNode(key)
            return
        if node.right:
            helper.append(node.right)
        else:
            node.right = newNode(key)
            return
    
  
       
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
