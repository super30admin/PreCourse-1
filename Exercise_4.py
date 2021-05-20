# Python program to insert element in binary tree  
from collections import  deque
class newNode():
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""

## In order traversal -> Left -> Root -> Right
def inorder(temp):
    if temp:
        inorder(temp.left)
        print(temp.key)
        inorder(temp.right)

  
  
"""function to insert element in binary tree """
def insert(temp,key):
    q = deque()
    q.append(temp)
    while q:
        temp = q.popleft()
        if not temp.left:
            temp.left = newNode(key)
        else:
            q.append(temp.left)
        if not temp.right:
            temp.right = newNode(key)
        else:
            q.append(temp.right)
  
    
  
       
# Driver code  
if __name__ == '__main__': 
    root = newNode(10)  
    root.left = newNode(11)  
    root.left.left = newNode(7)  
    root.right = newNode(9)  
    root.right.left = newNode(15)  
    root.right.right = newNode(8)  

       #    10
       #   /  \
       #  11   9
       #  /   / \
       # 7  15  8

    print("Inorder traversal before insertion:", end = " ") 
    inorder(root)  
  
    key = 12
    insert(root, key)  
  
    print()  
    print("Inorder traversal after insertion:", end = " ") 
    inorder(root) 
