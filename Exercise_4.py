# Python program to insert element in binary tree  
from collections import deque
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp): 
	"""
    	Time Complexity = O(n)
    	Space Complexity = O(n) Considering recursive stack as an extra space else it is O(1)
    """
	if temp:
		inorder(temp.left)
		print(temp.key + " ")
		inorder(temp.right)


"""function to insert element in binary tree """
def insert(temp,key):
	"""
    	Time Complexity = O(n)
    	Space Complexity = O(n)
    """
	if temp == None:
		return newNode(key)
	que = deque()
	que.append(temp)
	while que:
		node = que(pop.left())
		if not node.left:
			node.left = newNode(key)
			break

		if not node.right:
			node.right = newNode(key)
			break
		que.append(node.left)
		que.append(node.right)
	return temp
  
       
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
