    # Python program to insert element in binary tree  
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(root): 
  
    current = root  
    stack = [] # initialize stack 
    done = 0 
      
    while True: 
          
        # Reach the left most Node of the current Node 
        if current is not None: 

            stack.append(current) 
            current = current.left  

        elif(stack): 
            current = stack.pop() 
            print(current.key, end=" ")
            current = current.right  
  
        else: 
            break
       
    print() 
    
  
  
"""function to insert element in binary tree """
def insert(temp,key): 
    if (key < temp.key):
        if (temp.left != None):
            insert(temp.left, key)
        else:
            node= newNode(key)
            temp.left = node
    else:
        if (temp.right != None):
            insert(temp.right, key)
        else:
            node= newNode(key)
            temp.right = node


    
  
       
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
    
    
    
    
