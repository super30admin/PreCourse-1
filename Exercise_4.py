# Python program to insert element in binary tree  
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp):
    '''
    Iterate to the left of the root
    print value and then iterate to
    the right.
    Complexity: O(n)
    '''
    if temp:
        inorder(temp.left)
        print(temp.key)
        inorder(temp.right)
    else:
        print("No Nodes to traverse")

  
"""function to insert element in binary tree """
def insert(temp,key):
    '''
    Check if temp is None, then make this the root
    else create a Queue, append the root into it.
    We then remove the first element in the
    queue; if the root.left is empty we create a
    new node and assign our key to this else
    we traverse further to the root.left.
    Similarly we check if root.right is empty,
    if it is we create a node and assign it
    here else we append the root.right into the
    queue and iteratively do this until we either
    find a left or right which is empty.
    Complexity: O(n)
    '''
    if temp is None:
        temp = newNode(key)
    queue = []
    queue.append(temp)

    while len(queue):
        temp = queue[0]
        queue.pop(0)
        if not temp.left:
            temp.left = newNode(key)
            break
        else:
            queue.append(temp.left)

        if not temp.right:
            temp.right = newNode(key)
            break
        else:
            queue.append(temp.right)

       
# Driver code  
if __name__ == '__main__': 
    root = newNode(10)  
    root.left = newNode(11)  
    root.left.left = newNode(7)  
    root.right = newNode(9)  
    root.right.left = newNode(15)  
    root.right.right = newNode(8)  
  
    print("Inorder traversal before insertion:")
    inorder(root)  
  
    key = 12
    insert(root, key)  
  
    print()  
    print("Inorder traversal after insertion:")
    inorder(root) 
