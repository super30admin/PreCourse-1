# Time Complexity: O(n) as inorder and insert require traversal of entire tree
# Space Complexity: O(n) for inorder traversal which is recursive
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: Took some time to realise that you have to insert a new value as a newNode


from queue import Queue
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
    print(temp.key)
    inorder(temp.right)
  
"""function to insert element in binary tree """
def insert(temp,key): 
    if not temp:
        temp = newNode(key)
        temp.key = key
    else:
        mynode = newNode(key)
        mynode.key = key
        q1 = Queue(10)
        q1.put(temp)
        while not(q1.empty()):
            root = q1.get() 
            if root.left is not None:
                q1.put(root.left)
            else:
                root.left = mynode
                return 'Succesfully inserted '+str(key)+' as left child of '+ str(root.key)
            
            if root.right is not None:
                q1.put(root.right)
            else:
                root.right = mynode
                return 'Succesfully inserted '+str(key)+' as right child of '+ str(root.key)
    

  
    
  
       
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
    print(insert(root, key))
  
    print()  
    print("Inorder traversal after insertion:", end = " ") 
    inorder(root) 
