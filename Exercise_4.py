# Python program to insert element in binary tree  
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp):
    if not temp:
        return

    inorder(temp.left)
    inorder(temp.right)
    print(temp.key)
  
    
  
  
"""function to insert element in binary tree """
def insert(temp,key):
    if not temp:
        root = newNode(key)
    p = []
    p.append(temp)

    while len(p):
        temp = p[0]
        p.pop(0)

        if not temp.left:
            temp.left = newNode(key)
            break
        else:
            p.append(temp.left)

        if not temp.right:
            temp.right = newNode(key)
            break
        else:
            p.append(temp.right)
        

  
    
  
       
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
