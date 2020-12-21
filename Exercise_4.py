# Python program to insert element in binary tree

'''
Time Complexity :
inorder(): O(n) where n is the no of nodes in the tree
insert(): O(n) in the worst case when there is always only a left child for each of the nodes and the tree
looks like a straight line.

Space Complexity :
inorder(): Unsure. Havent had time to go through this. Look forward to discussing more.

Did this code successfully run on Leetcode :
Didnt run since the identifiers used had different names and I was running late to individually rename all.

Any problem you faced while coding this :
Not that I am aware of.
'''


#Your code here along with comments explaining your approach
class newNode():
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp):
    from collections import deque
    q = deque()
    q.append(temp)

    while len(q) != 0:
        if q[0].left is not None:
            q.append(q[0].left)
        if q[0].right is not None:
            q.append(q[0].right)
        print(q[0].key)
        q.popleft()
  
    
  
  
"""function to insert element in binary tree """
def insert(temp,key):
    if temp is not None:
        curr = temp
        while curr.left is not None:
            curr = curr.left
        curr.left = newNode(key)
  
    
  
       
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
