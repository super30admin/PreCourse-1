# Python program to insert element in binary tree  
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp): 
    
    if temp:
      #  print("L", temp.key)
        inorder(temp.left)

        print(temp.key, end = " ") 

       # print("R", temp.key)
        inorder(temp.right)
        
  
  
"""function to insert element in binary tree """
def insert(temp,key): 
    #if tree is empty
    if not temp:
      temp = newNode(key)
      return
   #Note: help taken from youtube to understand difference between BST and Binary Tree.
   #Was unsure on how to do the insertion for Binary Level Order Tree

    queue_node = []
    #basically assigning root node object location to queue, 
    #and converting the tree into a queue, each element being the node object
    #this is due to level order tree, would be different in BST
    queue_node.append(temp)
  
   
    while (len(queue_node)):
        #updating the original root to the new one which where a node would be inserted
        temp = queue_node[0]
        
        #taking each node out and checking if it has right and left node
        queue_node.pop(0)
        
        #checking the child, if empty we instert and stop
        if (not temp.left):
           temp.left = newNode(key)
           break
        else:
            queue_node.append(temp.left)
 
        if (not temp.right):
            temp.right = newNode(key)
            break
        else:
            queue_node.append(temp.right)
   #while not(traverse_stack):
                

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
#  
    print()  
    print("Inorder traversal after insertion:", end = " ") 
    inorder(root) 
