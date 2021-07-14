# Python program to insert element in binary tree  
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp):
    if temp.left!=None:
        inorder(temp.left)
    print(temp.key)
    if temp.right!=None:
        inorder(temp.right)
  
    
  
  
"""function to insert element in binary tree """
def insert(temp,key):
    #If root is not present
    if not temp:
        node = newNode(key)
        temp = node
    if key<temp.key:
        if temp.left == None:
            node = newNode(key)
            temp.left = node
            return
        else:
            insert(temp.left,key)
    else:
        if temp.right == None:
            node = newNode(key)
            temp.right = node
            return
        else:
            insert(temp.right, key)
  
    
  
       
# Driver code  
if __name__ == '__main__': 
    root = newNode(10)  
    root.left = newNode(9)  
    root.left.left = newNode(7)  
    root.right = newNode(15)  
    root.right.left = newNode(11)  
    root.right.right = newNode(18)  
  
    print("Inorder traversal before insertion:", end = " ") 
    inorder(root)  
  
    key = 12
    insert(root, key)  
  
    print()  
    print("Inorder traversal after insertion:", end = " ") 
    inorder(root) 
