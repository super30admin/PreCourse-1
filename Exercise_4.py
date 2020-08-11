# Python program to insert element in binary tree  
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp):
    # Recursive Solution
    # if temp: 
    #     inorder(temp.left)
    #     print (temp.key, end = " ")
    #     inorder(temp.right)

    # Iterative solution
    stack = []
    curr = temp
    while True:
        if curr != None:
            stack.append(curr)
            curr = curr.left
        elif stack:
            curr = stack.pop()
            print (curr.key, end = " ")
            curr = curr.right
        else:
            break



  
  
"""function to insert element in binary tree """
def insert(temp,key): 
    queue = []
    queue.append(temp)
    while queue:
        res = queue.pop(0)
        
        if res.left is None:
            res.left = newNode(key)
            break
        else:
            queue.append(res.left)
        
        if res.right is None:
            res.right = newNode(key)
            break
        else:
            queue.append(res.right)

  
       
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
