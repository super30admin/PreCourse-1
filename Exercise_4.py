from collections import deque

# Python program to insert element in binary tree  
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
# Time complexity - O(n)      where n is the no of nodes in the tree.
# Space complexity - O(log n) stacks
def inorder(temp):
    '''
        Iterative method - using stacks
        Inorder : left, root, right
    '''
    stack = deque()
    node = temp

    while node or stack:
        while node:
            stack.append(node)
            node = node.left
        node = stack.pop()
        print(node.key, end = " ")
        node = node.right

""" Inorder traversal of a binary tree"""
# Time complexity - O(n) n is the no of nodes in the tree.
# Space complexity - O(log n) recursive stack.
def inorder(temp):
    '''
        Recursive approach
        Inorder : left, root, right
    '''
    if not temp:
        return 

    inorder(temp.left)
    print(temp.key, end=" ")
    inorder(temp.right)

  
"""function to insert element in binary tree """
# Time complexity - O(n)     where n is the no of nodes in the tree. 
# Space complexity - O(n/2)  All the nodes in the last level are in the queue.
def insert(temp,key): 
    # create a new node
    new_node = newNode(key)

    # store the nodes to be traversed in a queue. 
    nodes = deque([temp])

    while nodes:
        curr = nodes.popleft()  # current element is the leftmost element in the queue.
        # append the curr nodes left child to the queue
        if curr.left:
            nodes.append(curr.left)
        else:   # assign the new node to the current node's left child.
            curr.left = new_node
            return

         # append the curr nodes right child to the queue
        if curr.right:
            nodes.append(curr.right)
        else:   # assign the new node to the current node's right child.
            curr.right = new_node
            return
  
       
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
  
    # insert nodes 
    key = 12
    insert(root, key) 
    key = 2
    insert(root, key)
    key = 17
    insert(root, key) 
    key = 20
    insert(root, key)  
    
    print()  
    print("Inorder traversal after insertion:", end = " ") 
    inorder(root) 
    print()  

    