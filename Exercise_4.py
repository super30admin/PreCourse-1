# Python program to insert element in binary tree  
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp): 
    #complexity : O(N)
    if temp:
        inorder(temp.left)
        print(temp.key,end =" ")
        inorder(temp.right)
  
"""function to insert element in binary tree """
def insert(temp,key): 
    if not temp:
        root = newNode(key)
        return
    
    curr = [temp]
    while len(curr)>0 :
        ele = curr.pop(len(curr)-1)
        if ele.left != None:
            curr.insert(0,ele.left)
        else:
            ele.left = newNode(key)
            return
        if ele.right != None:
            curr.insert(0,ele.right)
        else:
            ele.right = newNode(key)
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
