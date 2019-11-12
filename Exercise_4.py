# Python program to insert element in binary tree  
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp): 
    stack = []
    current = temp
    while current or stack:
        if current is not None:
            stack.append(current)
            current = current.left
        else:
            current = stack.pop()
            print(str(current.key) + ' ')
            current = current.right
  
    
  
  
"""function to insert element in binary tree """
def insert(temp,key): 
    queue = []
    queue.append(temp)
    while queue:
        current = queue.pop(0)
        if current.left:
            queue.append(current.left)
        else:
            current.left = newNode(key)
            break
        if current.right:
            queue.append(current.right)
        else:
            current.right = newNode(key)
            break
        

       
# Driver code  
if __name__ == '__main__': 
    root = newNode(10)  
    root.left = newNode(11)  
    root.left.left = newNode(7)  
    root.right = newNode(9)  
    root.right.left = newNode(15)  
    root.right.right = newNode(8)  
  
    print("Inorder traversal before insertion:", end = "\n") 
    inorder(root)  
  
    key = 12
    insert(root, key)  
  
    print()  
    print("Inorder traversal after insertion:", end = "\n") 
    inorder(root) 
