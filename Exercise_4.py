# Author: Ritika Chadha
# Exercise_4 : Insert an element in a Binary Tree

# Time Complexity: 
# Space Complexity: 
# Did this code successfully run on Leetcode: No
# Any problem you faced while coding this: Yes

class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp): 
  
    
  
  
"""function to insert element in binary tree """
def insert(temp,key): 
  
    
  
       
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
