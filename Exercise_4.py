# Python program to insert element in binary tree  
from collections import deque
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp): 
    if(temp==None):
        return
    inorder(temp.left)
    print(temp.key)
    inorder(temp.right)
  
"""function to insert element in binary tree """
def insert(temp,key): 
    node = newNode(key)
    if(temp == None):
        temp = node
        return
    queue = deque([temp])
    while(queue!=[]):
        free = queue.popleft()
        if(free!=None):
            if(free.left == None):
                free.left = node
                break
            elif(free.right == None):
                free.right = node
                break
            queue.append(free.left)
            queue.append(free.right)
    
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