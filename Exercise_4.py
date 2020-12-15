# Python program to insert element in binary tree
# Code ran with driver code below
# No issues coming up with this solution.

class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
# Inorder -- > left node, node's value followed by right node
# Time complexity -- O(n) where n represents the number of elements
# Space Complexity -- O(d) where d is the depth of the tree

def inorder(temp):
    if temp is None:
        return []
    
    else:
        inorder(temp.left)
        print(temp.key)
        inorder(temp.right)
  
  
"""function to insert element in binary tree """
# Logic - insert key in either left or right subtree wherever there is place for a child node, if not continue until we find a placeholder
# Time complexity --> O(n)
# Space Complexity -- > O(n) 

def insert(temp,key):
    if temp is None:
        temp = newNode(key)
        return 

    queue = []
    queue.append(temp)

    while queue != []:
        node = queue[0]
        queue.pop(0)

        if node.left is None:
            node.left = newNode(key)
            break
        else:
            queue.append(node.left)

        if node.right is None:
            node.right = newNode(key)
            break
        else:
            queue.append(node.right)



  
       
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
