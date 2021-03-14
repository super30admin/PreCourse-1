# Python program to insert element in binary tree  
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp):
    if temp != None:
        inorder(temp.left)
        print(temp.key)
        inorder(temp.right)
     
"""function to insert element in binary tree """
def insert(temp,key):
    if temp is None:
        return newNode(key)
    else:
        if temp.key == key:
            return temp
        elif temp.key > key:
            temp.right = insert(temp.right, key)
        else:
            temp.left = insert(temp.left, key)
    return temp
            
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
    
# // Did this code successfully run on LeetCode?:
# //         No did not find the problem. 

# //     Problems faced while coding this:
# //         Dont know whther the inorder traversal is working well or not. The order of placing the 
            # placing the elements into the tree has been changed. So not sure. 

# //     Approach:
# //        defined the BT, understood what each fucntions have to do and then coded them. 
