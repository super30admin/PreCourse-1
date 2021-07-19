# Python program to insert element in binary tree  
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp): 
    if temp is None:
        return
    else:
        inorder(temp.left)
        print(temp.key)
        inorder(temp.right)
"""function to insert element in binary tree """
def insert(temp,key): 
    if temp == None:
        temp = newNode(key)
    else:
        # Find a place to insert it.
        queue = []
        queue.append(temp)
        while len(queue) > 0:
            front_node = queue.pop(0)
            if front_node.left != None:
                queue.append(front_node.left)
            else:
                front_node.left = newNode(key)
                return
            if front_node.right != None:
                queue.append(front_node.right)
            else:
                front_node.right = newNode(key)
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
  
    key = 12
    insert(root, key)  
  
    print()  
    print("Inorder traversal after insertion:", end = " ") 
    inorder(root) 
