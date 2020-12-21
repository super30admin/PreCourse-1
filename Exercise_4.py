# Python program to insert element in binary tree  
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp):
    # inorder is left - root - right
    if(temp == None):
        return
    inorder(temp.left)
    print("")
    print(temp.key)
    inorder(temp.right)
  
    
  
  
"""function to insert element in binary tree """
def insert(temp,key):
    if(temp == None):
        return newNode(key)
    # going breadth first search manner, using queue
    q = [temp]
    while(len(q)>0):
        element = q.pop(len(q)-1)
        if(element.left != None):
            q.insert(0,element.left)
        else:
            element.left = newNode(key)
            return
        if(element.right != None):
            q.insert(0,element.right)
        else:
            element.right = newNode(key)
            return




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
