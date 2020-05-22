# Python program to insert element in binary tree  
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp): 
    if temp:
        inorder(temp.left)
        print(temp.key)
        inorder(temp.right)
  
  
"""function to insert element in binary tree """
def insert(temp,key):
    if not temp:
        temp = newNode(key)
    else:
        if not temp.left:
            temp.left = newNode(key)
            return
        elif temp.left:
            insert(temp.left, key)
            return
        if not temp.right:
            temp.right = newNode(key)
            return
        elif temp.right:
            insert(temp.right, key)
            return

#I failed to understand the condition to insert a node in the binary tree since there is no ordering as such. Therefore it is inserted as the left of 7
  
    
  
       
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
