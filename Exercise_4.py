# Time Complexity : O(n)
# Space Complexity : O(n) where n is the no of nodes in the tree
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

# Python program to insert element in binary tree  
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp): 
    if(temp.left!=None):
        inorder(temp.left) # using recursive calls to print left root tree from the leaf nodes
    print(temp.key)
    if(temp.right!=None):
        inorder(temp.right)
    
  
  
"""function to insert element in binary tree """
def insert(temp,key): 
    if(temp.key==key):
        return
    else:
        stack=[]
        stack.append(temp) # using stack to insert values level wise
        while(stack!=[]):
            top=stack[len(stack)-1] # getting the value at the top of the stack
            stack.pop()
            if(top.left==None):
                top.left = newNode(key) # inserting in the left sub tree
                break
            elif(top.right==None):
                top.right = newNode(key)# inserting in the right sub tree
                break
            else:
                stack.append(top.right)# inserting at the top of the stack
                stack.append(top.left)
         
       
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
