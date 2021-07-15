# Python program to insert element in binary tree  
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp):
    if temp == None:
     return
    inorder(temp.left)
    print(temp.key)
    inorder(temp.right)
  
    
  
  
"""function to insert element in binary tree - 
Do level order traversal until we find
an empty place and add the node"""
def insert(temp,key):
    if temp == None:
        root = newNode(key)
        return

    parent = [temp]
    child = []
    while len(parent) > 0:
     for elem in parent:
        if elem.left == None:
            elem.left = newNode(key)
            return
        else:
            child.append(elem.left)

        if elem.right == None:
            elem.right = newNode(key)
            return
        else:
            child.append(elem.right)
    
     parent = child
     child = []
        
       



  
    
      
# Driver code  
if __name__ == '__main__': 
    root = newNode(10)  
    root.left = newNode(11)  
    root.left.left = newNode(7)  
    root.right = newNode(9)  
    root.right.left = newNode(15)  
    root.right.right = newNode(8)  
  
    print("Inorder traversal before insertion:") 
    inorder(root)  
  
    key = 12
    insert(root, key) 
    
  
    print()  
    print("Inorder traversal after insertion:") 
    inorder(root) 

