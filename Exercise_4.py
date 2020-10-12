# Python program to insert element in binary tree  
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp): 
  helperinorder(temp)



def helperinorder(temp):
    if temp==None:
        return
    helperinorder(temp.left)
    print(temp.key)
    helperinorder(temp.right)
    
  
  
"""function to insert element in binary tree """
def insert(temp,key): 
    if key ==None or temp==None:
        return None
    helperinsert(temp, key)

def helperinsert(temp,key):
    if temp==None:
        return None
    
    if key<temp.key :
        if  temp.left!=None:
            helperinsert(temp.left, key)
        else:
            temp.left=newNode(key)
    else:
        if  temp.right!=None:
            helperinsert(temp.right, key)
        else:
            temp.right=newNode(key)



    
    
    
  
       
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
