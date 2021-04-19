
'''for insert operation : Time Complexity : O(logN) 
Space Complexity :O(1)
Did this code successfully run on Leetcode : did not find in leetcode
Any problem you faced while coding this : No
Your code here along with comments explaining your approach'''
# Python program to insert element in binary tree  
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp): 
    #inorder - Left-root-right
    if temp:
        inorder(temp.left) 
        print(temp.key)
        inorder(temp.right) 
    else:
        return 
    
  
  
"""function to insert element in binary tree """
def insert(temp,key): 
    #check if left node is none then add new key to left
    if temp.key:
        if key < temp.key:
            if temp.left is None:
                temp.left = newNode(key)
            else:
                insert(temp.left,key)
        elif key > temp.key:
            # check if right node to none then add new key to right
            if temp.right is None:
                temp.right = newNode(key)
            else:
                insert(temp.right,key)
    else:
        temp.key = key
    
    
  
       
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
