# Python program to insert element in binary tree  
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp): 
    if not temp:
        return None
    else:
        inorder(temp.left)
        print(temp.key)
        inorder(temp.right)

"""function to insert element in binary tree """
def insert(temp,key): 
    if not temp:
        temp = newNode(key)
        return 
    else:
        q = [temp]
        while q:
            cur = q.pop(0)
            if not cur.left:
                cur.left = newNode(key)
                break
            else:
                q.append(cur.left)
            if not cur.right:
                cur.right = newNode(key)
                break
            else:
                q.append(cur.right)

  
    
  
       
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
