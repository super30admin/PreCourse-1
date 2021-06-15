# Python program to insert element in binary tree  
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp, traversal): 
    if temp:
        traversal = inorder(temp.left, traversal)
        traversal += (str(temp.key) + ', ')
        traversal = inorder(temp.right, traversal)
    return traversal
    
  
  
"""function to insert element in binary tree """
def insert(temp,key): 
    # Assuming insertion at levelorder

    if temp is None:
        root = newNode(key)
        return

    val = newNode(key)
    queue = []
    queue.append(temp)

    while len(queue) > 0:
        node = queue.pop(0)

        if node.left:
            queue.append(node.left)
        else:
            node.left = val
            break

        if node.right:
            queue.append(node.right)
        else:
            node.right = val
            break
  
       
# Driver code  
if __name__ == '__main__': 
    root = newNode(10)  
    root.left = newNode(11)  
    root.left.left = newNode(7)  
    root.right = newNode(9)  
    root.right.left = newNode(15)  
    root.right.right = newNode(8)  
  
    print("Inorder traversal before insertion:", end = " ") 
    ans1 = inorder(root, "")  
    print(ans1)
  
    key = 12
    insert(root, key)  
  
    print()  
    print("Inorder traversal after insertion:", end = " ") 
    ans2 = inorder(root, "")
    print(ans2)
