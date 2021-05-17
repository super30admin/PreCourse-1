# Python program to insert element in binary tree  
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp):
    # print left subtree first then node then right subtree
    if temp == None:
        return;
    inorder(temp.left)
    print(temp.key)
    inorder(temp.right) 
  
    
  
  
"""function to insert element in binary tree """
def insert(temp,key):
    # Using queue to fill the node at lowest possible depth
    # insert root then insert left if left is not None
    # if left is none insert the key as a node in the left
    # insert right if right is not none
    # if right is none insert key as a node in the right 
    queue = []
    queue.append(temp)

    while len(queue) != 0:
        node = queue.pop(0)

        if node.left == None:
            node.left = newNode(key)
            return;
        else:
            queue.append(node.left)
        
        if node.right == None:
            node.right = newNode(key)
            return;
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
