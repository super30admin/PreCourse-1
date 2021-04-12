# Python program to insert element in binary tree  

"""
#####################################################################
inorderRecursive Method: Uses the recursive stack memory. (RAM)
Time Complexity : O(N)
Space Complexity : O(N)
#####################################################################
inorderIterative Method: A stack is implemented for this. It will follow all the time complexities for a regular stack data structure.
Total Time Complexity : O(N)
Total Space Complexity : O(N)
#####################################################################
insertUsingDFS Method: A stack is implemented for this. It will follow all the time complexities for a regular stack data structure.
Worst Case Time Complexity : O(N)
Space Complexity : O(N)

Another case here would be when the node to be inserted is present on a linear branch of a tree. 
Time complexity for that would be O(D) where D is the depth.

#####################################################################
insertUsingBFS Method: A queue is implemented for this. It will follow all the time complexities for a regular queue data structure.
Worst Case Time Complexity : O(N)
Space Complexity : O(N)

#####################################################################


"""
class newNode():  
  
	def __init__(self, data):  
		self.key = data 
		self.left = None
		self.right = None
		  
""" Inorder traversal of a binary tree"""
#Recursive
def inorderRecursive(temp): 
	if temp != None:
		inorderRecursive(temp.left)
		print(temp.key)
		inorderRecursive(temp.right)
	return
	
#Iterative	
def inorderIterative(temp): 
	
	stack = []
	currentElement = temp
	while True:

		if currentElement != None:
			stack.append(currentElement)
			currentElement = currentElement.left
			
		elif len(stack) > 0:
			currentElement = stack.pop(-1)
			print(currentElement.key)
			currentElement = currentElement.right
		else:
			break


"""function to insert element in binary tree """
#USING DFS
def insertUsingDFS(temp,key): 
	
	stack = [temp]
	elementInserted = False
	while len(stack):
		currentElement = stack.pop(-1)
		if currentElement.left != None and currentElement.right != None:
			stack.append(currentElement.right)
			stack.append(currentElement.left)
		elif currentElement.left != None and currentElement.right == None:
			currentElement.right = newNode(key)
			elementInserted = True
			break
		elif currentElement.left == None and currentElement.right != None:
			currentElement.left = newNode(key)
			elementInserted = True
			break
		
	if not elementInserted:
		currentElement.left = newNode(key)
	return True

#USING BFS
def insertUsingBFS(temp,key): 
	
	queue = [temp]
	elementInserted = False
	while len(queue):
		currentElement = queue.pop(0)
		if currentElement.left != None and currentElement.right != None:
			queue.append(currentElement.left)
			queue.append(currentElement.right)
		elif currentElement.left != None and currentElement.right == None:
			currentElement.right = newNode(key)
			elementInserted = True
			break
		elif currentElement.left == None and currentElement.right != None:
			currentElement.left = newNode(key)
			elementInserted = True
			break
		
	if not elementInserted:
		currentElement.left = newNode(key)
	return True
	   
# Driver code  
if __name__ == '__main__': 
	root = newNode(10)  
	root.left = newNode(11)  
	root.left.left = newNode(7)  
	root.right = newNode(9)  
	root.right.left = newNode(15)  
	root.right.right = newNode(8)  
	
	print("Inorder traversal before insertion:") 
	# inorderRecursive(root)  
	inorderIterative(root)  
  
	key = 12
	#insertUsingDFS(root, key)  
	insertUsingBFS(root,key)

	print()  
	print("Inorder traversal after insertion:") 
	# inorderRecursive(root) 
	inorderIterative(root) 
