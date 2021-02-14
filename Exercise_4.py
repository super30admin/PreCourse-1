# Python program to insert element in binary tree  
class newNode():  
  
    def __init__(self, data):  
        self.value = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(root): 
    if root:
        inorder(root.left)
        print(root.value)
        inorder(root.right)
  
  
"""function to insert element in binary tree """
def insert(root,key):
    node = newNode(key)
    if root is None:
        root= node 
    else:
        if root.value < key:
            if root.right is None:
                root.right=node
            else:
                insert(root.right, key)
        else:
            if root.left is None:
                root.left = node
            else:
                insert(root.left, key)
  
    
  
       
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
