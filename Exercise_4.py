# Python program to insert element in binary tree  
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp): 

    left = temp.left
    right = temp.right

    if left:
        inorder(left)

    print(temp.key)

    if right:
        inorder(right)

  
"""function to insert element in binary tree """
def insert(temp,key):
    curr = temp
    while curr:
        if curr.key <= key:
            if not curr.left:
                curr.left = newNode(key)
            curr = curr.left
        elif curr.key > key:
            if not curr.right:
                curr.right = newNode(key)
            curr = curr.right

  
    
  
       
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
