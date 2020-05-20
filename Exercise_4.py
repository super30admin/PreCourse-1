# Python program to insert element in binary tree  
from queue import Queue
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp): 
    if(temp==None):
        return
    inorder(temp.left)
    print(str(temp.key)+" ")
    inorder(temp.right)
        
"""function to insert element in binary tree """
def insert(temp,key): 
    q=Queue()
    q.put(temp)
    while(not(q.empty())):
        current_node=q.get()
        if(current_node.left):
            q.put(current_node.left)
        else:
            current_node.left=newNode(key)
            break;
        if(current_node.right):
            q.put(current_node.right)
        else:
            current_node.right=newNode(key)
            break;
    
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
