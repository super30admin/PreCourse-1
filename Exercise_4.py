"""
// Time Complexity :  O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes, checked for inorder function
// Any problem you faced while coding this : slight difficulty while building up logic for traversals
"""



# Python program to insert element in binary tree  
from collections import deque
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp): #(left,root,right)
    stack=[]
    output=[]
        
    cur=temp #start from root
    while True:
        while cur:
            stack.append(cur) #for adding all the left children along the way to the stack
            cur=cur.left
        if stack: 
            cur=stack.pop()
            output.append(cur.key)#adding the node to the result variable
            cur=cur.right #setting the next node to be the right child
        else:
            break
    print(output)
         
"""function to insert element in binary tree """
def insert(temp,key): 
    q=deque() #using queue for level-order traversal
    node = newNode(key) #creating new tree node 
    
    if not temp: #if no tree exists, new node is the root node
      temp=node
 
    else: #else we traverse levelwise
      q.append(temp)
      
      while q:
          cur = q.popleft()
          
          if not cur.left: #if current node has no left child, we insert the new node there
              cur.left=node 
              break
          else: #else the left node is added to the queue
              q.append(cur.left)
        
          if not cur.right:#if current node has no right child, we insert the new node there
              cur.right=node 
              break
          else:
              q.append(cur.right)#else the right node is added to the queue
    
  
       
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
    