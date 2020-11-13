# Python program to insert element in binary tree  
class newNode():  

    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None


""" Inorder traversal of a binary tree"""
def inorder(temp):
    inorder_travarsal = []
    stack = []
    cur = root
    while cur or stack:
        while cur:
            stack.append(cur)
            cur = cur.left
        cur = stack.pop()
        inorder_travarsal.append(cur.key)
        cur = cur.right
    print(inorder_travarsal)
    return inorder_travarsal

  
"""function to insert element in binary tree """
def insert(temp,key): 
    if temp == None:
        return newNode(key)
    q = [temp]
    while q:
        x = q.pop(0)
        if x.left == None:
            x.left = newNode(key)
            return True
        else:
            q.append(x.left)
        if x.right == None:
            x.right = newNode(key)
            return True
        else:
            q.append(x.right)
    

  
    
       
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
