# Python program to insert element in binary tree  
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp):
    '''
    print (left, root , right)
    '''
    if temp:
        inorder(temp.left)
        print(temp.key)
        inorder(temp.right)
    
def preorder(temp):
    '''
    print (root, left , right)
    '''
    if temp:
        print(temp.key)
        inorder(temp.left)
        inorder(temp.right)

def postorder(temp):
    '''
    print (left, right , root)
    '''
    if temp:
        inorder(temp.left)
        inorder(temp.right)
        print(temp.key)

  
"""function to insert element in binary tree """
def insert(temp,key):
    ptr=temp
    while True:
        if ptr.key < key:
            if ptr.left != None:
                ptr=ptr.left
            else:
                ptr.left = newNode(key)
                break
        else:
            if ptr.right != None:
                ptr=ptr.right
            else:
                ptr.right = newNode(key)
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
    inorder(root)
    print("preorder traversal before insertion:", end = " ")
    preorder(root)
    print("postorder traversal before insertion:", end = " ")
    postorder(root)


    key = 12
    insert(root, key)  
  
    print()  
    print("Inorder traversal before insertion:", end = " ")
    inorder(root)
    print("preorder traversal before insertion:", end = " ")
    preorder(root)
    print("postorder traversal before insertion:", end = " ")
    postorder(root)
