import queue
# Python program to insert element in binary tree
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp):
    if(temp == None):
        return
    inorder(temp.left)
    print(temp.key)
    inorder(temp.right)
  

"""function to insert element in binary tree """
def insert(temp,key):
    q = queue.Queue()
    q.put(temp)

    while not q.empty():
        node = q.get()
        if node.left == None:
            node.left = newNode(key)
            break
        elif node.right == None:
            node.right = newNode(key)
            break
        else:
            q.put(node.left)
            q.put(node.right)

    
  
       
# Driver code  
if __name__ == '__main__': 
    root = newNode(10)  
    root.left = newNode(11)  
    root.left.left = newNode(7)  
    root.right = newNode(9)  
    root.right.left = newNode(15)  
    root.right.right = newNode(8)  
  
    print("Inorder traversal before insertion:")
    inorder(root)  
  
    key = 12
    insert(root, key)  
  
    print("Inorder traversal after insertion:")
    inorder(root)
