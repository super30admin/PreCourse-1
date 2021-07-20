# Python program to insert element in binary tree 
import queue 
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp):
    if temp == None:
        return
    inorder(temp.left)
    print(temp.key, end=" ")
    inorder(temp.right)


"""function to insert element in binary tree """


def insert(temp, key):
    if temp == None:
        temp = newNode(key)
        return temp
    q = queue.Queue()
    dataNode = newNode(key)
    insertionNode = temp
    q.put(insertionNode)
    while q.qsize() > 0:
        insertionNode = q.get()
        if insertionNode.left != None:
            q.put(insertionNode.left)
        if insertionNode.right != None:
            q.put(insertionNode.right)
        if insertionNode.left == None:
            insertionNode.left = dataNode
            return
        if insertionNode.right == None:
            insertionNode.right = dataNode
            return


    
  
       
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
