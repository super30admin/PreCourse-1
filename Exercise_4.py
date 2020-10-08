# Python program to insert element in binary tree  
# Time Complexity : O(height)
# Space Complexity : O(n)
# Any problem you faced while coding this : No
class newNode():  

    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None

""" Inorder traversal of a binary tree"""
#Inorder traversal follos the simple leeft->root->right strategy hence used the same to traverse the tree recursively.
def inorder(temp):
    if temp is None:
        return
    inorder(temp.left)
    print("Data:",temp.key)
    inorder(temp.right)


"""function to insert element in binary tree """
#To insert the new node into the tree, I used BFS to find where a node is missing.
#When I found a space where either left or right is None, I inserted the node in the tree respectively.
def insert(temp,key): 
    bfsList = list()
    bfsList.append(temp)
    while(len(bfsList)!=0):
        elem = bfsList.pop(0)
        if (elem.left is None):
            elem.left = newNode(key)
            break
        else:
            bfsList.append(temp.left)

        if (elem.right is None):
            elem.right = newNode(key)
            break
        else:
            bfsList.append(temp.right)

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
