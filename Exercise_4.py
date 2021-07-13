# Python program to insert element in binary tree  
class newNode():
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp): 
    stack = [temp]
    inorder_traversal = []
    root = temp
    while stack or root:
        if root: 
            stack.append(root)
            root = root.left
        else:
            cur = stack.pop()
            inorder_traversal.append(cur.key)
            root = cur.right
    print(*inorder_traversal)
        

"""function to insert element in binary tree """
def insert(temp, key): 
    q = [temp]
    while q:
        new_q = []
        for cur_node in q:
            # If current node has no left child
            if not cur_node.left: 
                cur_node.left = newNode(key)
                return 
            # Add child to the level order traversal queue
            new_q.append(cur_node.left)
            
            # If current node has no right child
            if not cur_node.right:
                cur_node.right = newNode(key)
                return 
            # Add child to the level order traversal queue
            new_q.append(cur_node.right)
        q = new_q
       
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
