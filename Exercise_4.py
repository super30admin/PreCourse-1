"""
Time Complexity : O(n)
Space Complexity : O(n)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this :
"""
# Python program to insert element in binary tree  
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp): 
    #first we print the left nodes
    #then we print root and then the right nodes
    if temp == None:
        return
    inorder(temp.left)
    print(temp.key, end=" ")
    inorder(temp.right)
     
"""function to insert element in binary tree """
"""If the root is empty insert it otherwise if the
inserting value is greater than the parent node it will
be inserted as the right child and if less than the parent 
node then it will be inserted as the left child. 
Just for safety we'll also check if it is equal to parent
if so we'll return it as there cannot be duplicate entries."""
def insert(temp,key): 
    if not temp:
        temp = newNode(key)
        return
    list1 = []
    list1.append(temp)
    
    while (len(list1)):
        temp = list1[0]
        list1.pop(0)

        if (not temp.right):
            temp.right = newNode(key)
            break
        else:
            list1.append(temp.right)
            
        if (not temp.left):
            temp.left = newNode(key)
            break
        else:
            list1.append(temp.left)

    
  
       
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
