# Python program to insert element in binary tree  
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""

def inorder(temp):
    st = []
    res = []
    curr = temp
    while(curr):
        st.append(curr)
        curr = curr.left
    while(len(st)):
        curr = st.pop()
        res.append(curr.key)
        if curr.right:
            curr = curr.right
            while(curr):
                st.append(curr)
                curr = curr.left
    print(res)
    
  
  
"""function to insert element in binary tree """
def insert(temp,key): 
    queue = [temp]
    node = newNode(key)
    while queue:
        curr = queue.pop(0)
        if not curr.left:
            curr.left = node
            return
        if not curr.right:
            curr.right = node
            return
        queue.append(curr.left)
        queue.append(curr.right)
    

        

    
  
       
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
