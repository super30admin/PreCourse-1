"""
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : N/A 
// Any problem you faced while coding this : None
// Your code here along with comments explaining your approach
Algorithm Explanation
1)Iterate through the tree in level order way
2) q = [root]
3) While q not empty
    if q.right add q.right to queue
    else:
        q.right = newele
        return
    if q.left add q.left to queue
    else:
        q.left = newele
        return
"""
# Python program to insert element in binary tree  
class newNode:
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp): 
    if temp:
        inorder(temp.left)
        print(temp.key)
        inorder(temp.right)

  
"""function to insert element in binary tree """
def insert(temp,key):
    newnode = newNode(key)

    q = [temp]
    add = False
    while q:
        node = q.pop(0)
        if not node.left:
            node.left = newnode
            #add = True
            break
        else:
            q.append(node.left)
        if not node.right:
            node.right = newnode
            #add = True
            break
        else:
            q.append(node.right)
       
# Driver code  
if __name__ == '__main__': 
    root = newNode(10)  
    root.left = newNode(11)  
    root.left.left = newNode(7)  
    root.left.right = newNode(12)
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
