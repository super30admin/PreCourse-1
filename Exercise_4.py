# Python program to insert element in binary tree  
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
from collections import deque         
""" Inorder traversal of a binary tree"""
def inorder(temp): 
    #O(N)
    #O(h)
    if not temp:
        return
    inorder(temp.left)
    print(temp.key,"  ")
    inorder(temp.right)
  
  
"""function to insert element in binary tree """
def insert(temp,key):
    #O(N)
    #O(N) 
    if not temp:
        return
    q=deque()
    q.append(temp)
    while q:
        cur=q.popleft()
        if cur.left:
            q.append(cur.left)
        else:
            added=newNode(key)
            cur.left=added
            break
        if cur.right:
            q.append(cur.right)
        else:
            added=newNode(key)
            cur.right=added
            break

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
