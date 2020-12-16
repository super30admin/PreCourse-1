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
        print(temp.key, end=" ")
        inorder(temp.right)
#runtime complexity O(n)
  
  
"""function to insert element in binary tree """
def insert(temp,key): 
    #Assuming NO DUPLICATES are allowed in binary key 
    current = temp
    while current.left:
        current = current.left
    current.left = newNode(key)
#runtime complexity O(h) where h is the height of the tree. h = n

def insertBST(temp, key):
    current = temp
    tempNode = newNode(key)
    while current.left and current.right:
        if current.key < key:
            current  = current.right
        elif current.right > key:
            current = current.left
    if current.key < key:
            current.right = tempNode
    elif current.right > key:
        current.left = tempNode
#runtime complexity O(h) where h is the height of the tree. h = n

  
       
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

    print()
    print("Inorder traversal after BST insertion:", end = " ") 
    insertBST(root, key)  
    inorder(root)   
