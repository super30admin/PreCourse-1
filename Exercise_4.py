# Python program to insert element in binary tree  
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp):
    """ 
    Inorder traversal of a binary tree left part , then root and then right part
    Takes O(total nodes(n)) time.
    """
    if not temp:
        return
    inorder(temp.left)
    print(temp.key)
    inorder(temp.right)
     
  
    
  
  
"""function to insert element in binary tree """
def insert(temp,key, flag):
    """
    Function to add element inside tree. We use flag to check if the element has been inserted else we might insert duplicates
    Takes O(height (h)) time.
    """
    if flag:
        return
    if not temp.left and not flag:
        temp.left =  newNode(key)
        flag.append("1")
    if not temp.right and not flag:
        temp.right =  newNode(key)
        flag.append("1")
    if not flag:
        insert(temp.left,key, flag)
    if not flag:
        insert(temp.right,key,flag)
  
    
  
       
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
    flag = []
    insert(root, key, flag)  
  
    print()  
    print("Inorder traversal after insertion:", end = " ") 
    inorder(root) 
