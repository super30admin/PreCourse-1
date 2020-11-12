# Python program to insert element in binary tree  
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp): # Inorder traversal is Visiting left subtree, root, visiting right subtree
        if (temp==None):
            return

        inorder(temp.left)
        print(temp.key,end=" ")
        inorder(temp.right)
  
"""function to insert element in binary tree """
def insert(temp,key):   # Inserting first element as root
        if (temp==None):
            root=newNode(key)
            return
        queue=[]            # If root is not empty than checking for left child or right child
        queue.append(temp)  # whichever is empty

        while(len(queue)):
            temp=queue[0]     
            queue.pop(0)

            if(temp.left==None):
                temp.left=newNode(key)  # If left child is empty new key is assigned as left child
                break
            else:
                queue.append(temp.left)
        
            if (temp.right==None):          # If right child is empty new key is assigned as right child
                temp.right=newNode(key)
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
  
    print("Inorder traversal before insertion:", end = " ") 
    inorder(root)  
  
    key = 12
    insert(root, key)  
  
    print()  
    print("Inorder traversal after insertion:", end = " ") 
    inorder(root) 
