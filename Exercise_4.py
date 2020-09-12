# Python program to insert element in binary tree  
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(root):
    if not root:
        return
    inorder(root.left)
    #print(root.key)
    inorder(root.right)  
  
"""function to insert element in binary tree """
def insert(root,key): 
    queue = []
    queue.append(root)
    #print(queue)

    while len(queue)>0:
        curr = queue[0]
        queue.pop(0)
        #print(queue)
        if not curr.left:
            curr.left = newNode(key)
            break
        else:
            queue.append(curr.left)
        
        if not curr.right:
            curr.right = newNode(key)
            break
        else:
            queue.append(curr.right)  
       
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
