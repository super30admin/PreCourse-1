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
    inorder(temp.left)
    print(temp.key, end = " ")
    inorder(temp.right) 
  
"""function to insert element in binary tree """
def insert(temp,key): 
    # Empty tree 
    if temp is None:
        root = newNode(key)
        return
    
    # level order traversal using a list till an empty spot is found
    temp_list = []
    temp_list.append(temp)
    
    while(len(temp_list)):
        temp = temp_list[0]
        temp_list.pop(0)
        
        if temp.left is None:
            temp.left = newNode(key)
            break
        else:
            temp_list.append(temp.left)
            
        if temp.right is None:
            temp.right = newNode(key)
            break
        else:
            temp_list.append(temp.right)

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
