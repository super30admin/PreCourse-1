# Python program to insert element in binary tree  
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp):
    '''
    Time Complexity: O(n)
    Space Complexity: O(n)
    '''
    stack = []
    res = []
    curr = root

    # while your stack isn't empty and your root is not none (last one)
    while curr is not None or stack != []:
        # while your current is not none, then keep appending
        while curr is not None:
            stack.append(curr)
            curr = curr.left
        # set your current to the last stack pos
        curr = stack.pop()
        # append this value (leftmost)
        res.append(curr.key)
        # increase current to right
        curr = curr.right
    return res
  
"""function to insert element in binary tree """
def insert(temp,key):
    '''
    Time Complexity: O(n)
    Space Complexity: O(1)
    '''
    # base case
    if not temp: return newNode(key)

    if key > temp.key:
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
    print(inorder(root))  
  
    key = 12
    insert(root, key)  

    print("Inorder traversal after insertion:", end = " ") 
    print(inorder(root))
