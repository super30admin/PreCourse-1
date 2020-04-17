# Python program to insert element in binary tree
#Time complexities would be depend on the number of nodes ie. O(n) where n is the number of nodes.
class newNode():
  
    def __init__(self, data):
        
        self.left = None
        self.right = None
        self.key = data


""" Inorder traversal of a binary tree"""
def inorder(temp):
  
    if temp:
        inorder(temp.left)
        print(temp.key)
        inorder(temp.right)
  
  
"""function to insert element in binary tree """
def insert(temp,key):
    
    tempNode = newNode(key)
  
    if temp is None:
        temp=tempNode
    else:
        if temp.key<key:
            if temp.right is None:
                temp.right=tempNode
            else:
                insert(temp.right,key)
        else:
            if temp.left is None:
                temp.left=tempNode
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
  
    print()
    print("Inorder traversal after insertion:", end = " ")
    inorder(root) 
