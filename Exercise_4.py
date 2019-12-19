# Python program to insert element in binary tree  
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None

class Queue():
    def __init__(self):
        self.items = []

    # Insert the element at the start of the Python list and shift all other elements by +1 index
    # Built in python insert function will take care of the shifting
    def enqueue(self, item):
        self.items.insert(0, item)

    # Return the element at the end of the Python list using the built in function pop()
    def dequeue(self):
        if not self.is_empty():
            return self.items.pop()

    # Checks if the queue is empty
    def is_empty(self):
        return len(self.items) == 0

    # Returns the element in front of the queue without modifying the items array
    def peek(self):
        if not self.is_empty():
            return self.items[-1].value

    # Overrride the default len method of Python
    def __len__ (self):
        return self.size()

    # Returns the size of the queue at the time of this function call
    def size(self):
        return len(self.items)           


""" Inorder traversal of a binary tree"""
def inorder(temp):
    """
    Left --> Root --> Right
    Traverse through the left sub tree, print the key
    Then print the current key which is the root of the subtree
    Then traverse through the right sub tree, print the key
    """
    currentNode = temp
    if currentNode is not None:     
        inorder(temp.left)
        print(temp.key, end= " ")
        inorder(temp.right)
    
  
  
"""function to insert element in binary tree """
def insert(temp,key):
    if temp is None:
        return
    else:
        queue = Queue()
        # Enqueue the root node
        queue.enqueue(temp)

        # While the length of the queue is greater than zero
        while len(queue) > 0:
            # Dequeue the node from the front of the queue
            node = queue.dequeue()
            # Insert the new node in the left, if the node has no left child. Exit the loop
            if node.left is None:
                node.left = newNode(key)
                break
            # Insert the new node in the right, if the node has no right child. Exit the loop
            if node.right is None:
                node.right = newNode(key)
                break
            # Enqueue the left and right child of the current node if they exist
            if node.left:
                queue.enqueue(node.left)
            if node.right:
                queue.enqueue(node.right)      

  
    
  
       
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
