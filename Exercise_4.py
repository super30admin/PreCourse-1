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
    node=newNode(key)
    if temp==None:
        temp=node
        return
    if key<=temp.key:
        
        if temp.left==None:
            temp.left=node
        else:
            insert(temp.left,key)
    else:
        if temp.right==None:
            temp.right=node
            
        else:
            insert(temp.right,key)
       
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
    
"""
Time complexity for inorder of BST is height of tree- O(h)- h is height
Space complexity of a binary search tree is O (n)-n number of nodes of tree 
"""
