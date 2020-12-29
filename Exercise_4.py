# Python program to insert element in binary tree 

    
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None

""" Inorder traversal of a binary tree"""
def inorder(temp): 
    t = temp
    if t:
        inorder(t.left)
        print(t.key)
        inorder(t.right)
    return 0
    
"""function to insert element in binary tree """
def insert(temp,key): 
    t = temp
    while(t):
        r = t
        if t.key == key:
          print('key already present')
          return
        elif key > t.key:
          t = t.left
        else:
          t = t.right
      
    # print(r.key,r.right,r.left)
    if key > r.key:
        r.left = newNode(key)
    else:
        r.right = newNode(key)
    

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
