# Python program to insert element in binary search tree  
class newNode():  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp): 
    
  
  
"""function to insert element in binary tree """
def insert(key): 
    
  
       
# Driver code  
if __name__ == '__main__': 
    root = newNode(10)  
    root.left = newNode(6)  
    root.left.left = newNode(2)  
    root.right = newNode(15)  
    root.right.left = newNode(11)  
    root.right.right = newNode(20)  
  
    print("Inorder traversal before insertion:", end = " ") 
    inorder(root)  
  
    key = 12
    insert(key)  
  
    print()  
    print("Inorder traversal after insertion:", end = " ") 
    inorder(root) 
