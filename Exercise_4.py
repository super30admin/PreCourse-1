# Python program to insert element in binary tree  
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp): 
    if not temp:
        return temp
    if temp:
        inorder(temp.left)
        print(temp.key)
        inorder(temp.right)
   
  
    
  
  
"""function to insert element in binary tree """
def insert(temp,key): 
    if not temp:
        return newNode(key)
    else:
        t = []
        t.append(temp)

    while ( len(t) != 0 ):

        r = t.pop(0)

        if(r.left is None):
            r.left = newNode(key)
            break
        else:
            t.append(r.left)
        if(r.right is None):
            r.right = newNode(key)
            break
        else:
            t.append(r.right)
    return temp
  
    
  
       
# Driver code  
if __name__ == '__main__': 
    root = newNode(10)  
    root.left = newNode(11)  
    root.left.left = newNode(7)  
    root.right = newNode(9)  
    root.right.left = newNode(15)  
    root.right.right = newNode(8)  
  
    #print("Inorder traversal before insertion:", end = " ") 
    inorder(root)  
  
    
    key = 12
    insert(root, key)

    #print()
    print("Inorder traversal after insertion:")
    inorder(root)