class Node:
	def __init__(self,data):
		self.data = data
		self.next = None

class LinkedList:
	def __init__(self):
		self.head = None

	#Insert a new node
	def insert(self,data):
		node = Node(data)
		node.next = self.head
		self.head = node
	#Traverse the linked list
	def traverse(self):
		curr = self.head
		while curr != None:
			print(curr.data)
			curr = curr.next

#Driver code
LL = LinkedList()
LL.insert(1)
LL.insert(2)
LL.insert(3)

#Printing to verify the data are inserted correctly
LL.traverse()
