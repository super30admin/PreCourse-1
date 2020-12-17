# Python program to insert element in binary tree  
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp): 
    """ 
    should return list of items in specific order    
    visit left sub-tree first and then move to right
    """
    current_node = temp
    stack = [] # Use stack to get traversal easier
    output = [] # to store output as an array/list
    
    while True:
        if current_node != None:
            stack.append(current_node)
            current_node = current_node.left
        elif stack:
            current_node = stack.pop()
            output.append(current_node.key)
            current_node = current_node.right
        else:
            break
            
    return output
        
  
  
"""function to insert element in binary tree """
def insert(temp,key): 
    
    node = newNode(key)
    lead_node = temp
    insert_node = None
    
    while lead_node != None:
        insert_node = lead_node
        if key < lead_node.key:
            lead_node = lead_node.left
        else:
            lead_node = lead_node.right
    
    if insert_node == None:
        insert_node = node
    elif key < insert_node.key:
        insert_node.left = node
    else:
        insert_node.right = node
        
    return insert_node
       
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
  
    print()  
    print("Inorder traversal after insertion:", end = " ") 
    print(inorder(root))
