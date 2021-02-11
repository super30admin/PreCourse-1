# Python program to insert element in binary tree  
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(self): 
    inorderarray=[]
    if root is not None:
        inorderarray = self.inorder(root.left)
        inorderarray.append(root.key)
        inorderarray = inorder + self.inorder(root.right)
    return inorderarray

    
  
  
"""function to insert element in binary tree """
def insert(self,key): 
    if self.key:
            if key < self.key:
                if self.left is None:
                    self.left = newNode(key)
                else:
                    self.left.insert(key)
            elif key > self.key:
                if self.right is None:
                    self.right = Node(key)
                else:
                    self.right.insert(key)
    else:
        self.key = key
    
  
    
  
       
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
