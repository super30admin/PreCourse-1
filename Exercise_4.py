# Python program to insert element in binary tree  
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp):
    if temp:
        inorder(temp.left)
        print(temp.key)
        inorder(temp.right)
    
  
  
"""function to insert element in binary tree """
def insert(temp,key):
    new_node = newNode(key)
    if temp is None:
        temp = new_node
        return
    else:
        curr_node = temp
        if temp.right is None:
            temp.right=new_node
            return
        elif temp.right is not None:
            insert(temp.right,key)
        elif temp.left is None:
            temp.left = new_node
            return
        else:
            insert(temp.left,key)


    
  
       
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

    insert(root,40)  
  
    print()  
    print("Inorder traversal after insertion:", end = " ") 
    inorder(root) 
