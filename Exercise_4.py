# Python program to insert element in binary tree  
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp): 
    if temp:
        inorder(temp.left)
        print(temp.key)
        inorder(temp.right)

"""function to insert element in binary tree """
def insert(temp,key):
    if not temp:
        temp=newNode(key)
        return 
    else:
        lst=[]
        lst.append(temp)
        while(len(lst)):
            node=lst.pop(0)
            if not node.left:
                node.left=newNode(key)
                break
            else:
                lst.append(node.left)

            if not node.right:
                node.right=newNode(key)
                break
            else:
                lst.append(node.right)

       
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
