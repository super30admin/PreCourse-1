# Python program to insert element in binary tree  

from collections import deque

class Node: 
    def __init__(self, data):  
        self.data = data 
        self.left = None
        self.right = None

class BinaryTree:
	def __init__(self):
		self.root = None
	
	def getRoot(self):
		return self.root
			  
	"""function to insert element in binary tree """
	def insert(self,data):
		#If root is itself None and insert at root
		if self.root == None:
			self.root = Node(data)
		else:
			q = deque()
			q.append(self.root)
			while len(q) > 0:
				curr = q.popleft()
				#If the self node does not have any left child, then simply add new node at left
				if curr.left == None:
					curr.left = Node(data)
				#If the self node does not have any right child, then simply add new node at right
				elif curr.right == None:
					curr.right = Node(data)
				#If left and right child are present
				else:
					q.append(curr.left)
					q.append(curr.right)
""" Inorder traversal of a binary tree"""
def inorder(node):
	if node == None:
		return None
	inorder(node.left)
	print(node.data, end = " ")
	inorder(node.right)
	
# Driver code  
if __name__ == '__main__':
	tree = BinaryTree()
	tree.insert(1)
	tree.insert(2)
	tree.insert(3)
	tree.insert(4)
	tree.insert(5)
	inorder(tree.getRoot())