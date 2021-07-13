# Python program to insert element in binary tree  
import collections

class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp): 
    if temp:
        inorder(temp.left)
        print(temp.key, end=" ")
        inorder(temp.right)
    else:
        return 
    
  
  
"""function to insert element in binary tree """
def insert(temp,key): 
    if not temp:
        temp=newNode(key)
        return
    q=collections.deque()
    q.append((0,temp))
    while q:
        level,root=q.popleft()
        if root.left is None:
            root.left=newNode(key)
            break
        else:
            q.append((level+1,root.left))
        
        if root.right is None:
            root.right=newNode(key)
            break
        else:
            q.append((level+1,root.right))
  
    
  
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
