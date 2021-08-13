# Python program to insert element in binary tree  
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""

def inorder(temp):
    """
    Inorder traversal using recursive method
    ---------
    arguments:
    temp: newNode - root of the binary tree
    ---------
    returns:
    inorder_traversal: list - keys of nodes visited in order of inorder traversal
    TC: O(n)
    SC: O(n)
    """
    inorder_traversal = []
    def _inorder(temp):
        if not temp:
            return
        _inorder(temp.left)
        inorder_traversal.append(temp.key)
        _inorder(temp.right)
    _inorder(temp)
    print(inorder_traversal)
    

from collections import deque
"""function to insert element in binary tree """
def insert(temp,key):
    """
    insert element into binary tree at first available spot
    uses level order traversal to find first available spot
    ---------
    arguments:
    temp: newNode - root of binary tree
    key: int - data value to insert into tree
    ---------
    returns:
    None - modifies tree in-place
    TC: O(N)
    SC: O(N)
    """
    if not temp:
        return newNode(key)
    q = deque([temp])
    insertNode = newNode(key)
    while q:
        node = q.popleft()
        if not node:
            return
        if not node.left:
            node.left = insertNode
            break
        q.append(node.left)
        if not node.right:
            node.right = insertNode
            break
        q.append(node.right)
        

    
  
       
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
