Time and space complexity: O(n) for inorder transversal and O(h) where h is the depth of the binary tree for the insert operation
Executed: Yes, in jupyter notebook.
Challenge: Inorder transversal was throwing an error (maximum recursion depth exceeded). Now it is rectified.

# Python program to insert element in binary tree  
class newNode():  
  def __init__(self, data):  
    self.data = data 
    self.left = None
    self.right = None

#Inorder traversal of a binary tree
def inorder(root): 
  if root:
    inorder(root.left)
    print (root.data)
    inorder(root.right) 
         
        
#function to insert element in binary tree
def insert(root,data): 
  if root is None:
    root = newNode(data)
  else:
    helper(data,root)
      
    
def helper(data, curr_node):
  if curr_node.data > data:
    if curr_node.left is None:
      curr_node.left = newNode(data)
    else:
      helper(data,curr_node.left)
  elif curr_node.data < data:
    if curr_node.right is None:
      curr_node.right = newNode(data)
    else:
      helper(data, curr_node.right)
  else:
    print ("Value is already found in binary tree. No duplicates")      
       
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
  
    key1,key2 = 12,24
    insert(root, key1)  
    insert(root, key2)  
  
    print()  
    print("Inorder traversal after insertion:", end = " ") 
    inorder(root) 
