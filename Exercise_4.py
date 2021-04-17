# Python program to insert element in binary tree



# implementing using recursion
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None

          
""" Inorder traversal of a binary tree"""
def inorder(temp):
        if temp is None:
            return
        print(temp.key)
        inorder(temp.right)
        inorder(temp.left)
  
"""function to insert element in binary tree """
def insert(root,key):

       if root.left is None and root.right is None:
           root.left= newNode(key)
           return
       else:
           if root.right is None:
               root.right=newNode(key)
               return
           elif root.left is None:
               root.left=newNode(key)
               return
       if root.key> key:
           insert(root.right,key)
       elif root.key<key:
           insert(root.left,key)


# implement using the iterative approach
def iterative_insert(tmp,key):
    if tmp is None:
        tmp =newNode(key)
        return tmp
    parent=tmp
    current=None

    while parent:
        current=parent

        if key>parent.key:
            parent=parent.right
        elif key< parent.key:
            parent=parent.left
    if key < current.key:
        current.left=newNode(key)
    else:
        current.right=newNode(key)




def iterative_inorder(tmp):
    if tmp is None:
        return
    iterative_stack=[]
    traversalString=''
    iterative_stack.append(tmp)
    while iterative_stack:
        node=iterative_stack.pop()

        traversalString+=" ,"+str(node.key)
        if node.left is not None:
            iterative_stack.append(node.left)
        if node.right is not None:
            iterative_stack.append(node.right)

    print(traversalString)
    return traversalString


       
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
    key = [12,87,90,54]
    for charcater in key:
        iterative_insert(root, charcater)
    print(iterative_inorder(root))
    print("Inorder traversal after insertion:", end = " ") 
    inorder(root)

