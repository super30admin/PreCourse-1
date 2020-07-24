# Python program to insert element in binary tree  
class newNode():  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(root): 
    if root == None:
        return []
        
    left = inorder(root.left)
    right = inorder(root.right)

    return left + [root.key] + right
 
"""function to insert element in binary tree """
def insert(root, key): 
    if root == None:
        root = newNode(key)
        return root
    
    ptr = root
    while True:
        if key < ptr.key:
            if not ptr.left:
                ptr.left = newNode(key)
                break
            ptr = ptr.left
        
        elif key > ptr.key:
            if not ptr.right:
                ptr.right = newNode(key)
                break
            ptr = ptr.right
                 
# Driver code  
if __name__ == '__main__': 
    root = newNode(10)  
    root.left = newNode(9)  
    root.left.left = newNode(7)  
    root.right = newNode(16)  
    root.right.left = newNode(15)  
    root.right.right = newNode(18)  
  
    print("Inorder traversal before insertion:", end = " ") 
    print(inorder(root))  
  
    key = 12
    insert(root, key)  
  
    print()  
    print("Inorder traversal after insertion:", end = " ") 
    print(inorder(root)) 
