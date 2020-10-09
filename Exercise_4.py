#Time Complexity : O(n)
#Space Complexity : O(n)
#Did this code successfully run on Leetcode : No, I did not run it on leetcode
#Any problem you faced while coding this : No


#Your code here along with comments explaining your approach

# Python program to insert element in binary tree  
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp):
    #if root is not present then return
    if temp == None:
        return    
    # else traverse through left sub branch then root node and then right sub branch
    inorder(temp.left) 
    print(temp.key,end = " ")
    inorder(temp.right)   
    
"""function to insert element in binary tree """
def insert(temp,key):
    # if temp is null insert the given node at the root
    if temp == None:
        root = newNode(key)
        return
    q = [] 
    q.append(temp) 
    #we traverse through the binary tree and will insert the new element at the 
    #brach where there is no element
    while len(q): 
        temp = q[0] 
        q.pop(0) 
 
        if temp.left == None:
            temp.left = newNode(key) 
            break
        else:
            q.append(temp.left) 
 
        if temp.right == None:
            temp.right = newNode(key) 
            break
        else:
            q.append(temp.right)
  
    
  
       
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
