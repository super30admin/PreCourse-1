# Python program to insert element in binary tree  
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp): 
    if temp is None:
        return
    inorder(temp.left)
    print(str(temp.key), end = " ")
    inorder(temp.right)

  
    
  
  
"""function to insert element in binary tree """
def insert(temp,key): 
    if temp is None:
        temp = newNode(key)
        return
    queue = []
    queue.append(temp)
    while len(queue) != 0:      # level order traversal to add new node to tree
        cur = queue.pop(0)

        if cur.left is None:
            cur.left = newNode(key)
            break
        elif cur.right is None:
            cur.right = newNode(key)
            break
        queue.append(cur.left)
        queue.append(cur.right)

  
    
  
       
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
