from collections import deque
# Python program to insert element in binary tree  
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp): 
    if not temp:
        return
    inorder(temp.left)
    print(str(temp.key), end = " ")
    inorder(temp.right)
  
  
"""function to insert element in binary tree """
def insert(temp,key):
    new_node = newNode(key) 
    if not temp:
        temp = new_node
        return
    de = deque([temp])
    while de:
        node = de.popleft()
        if node.left:
            de.append(node.left)
        else:
            node.left = new_node
            return
        if node.right:
            de.append(node.right)
        else:
            node.right = new_node
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
