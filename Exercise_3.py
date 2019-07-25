class Node():
	def __init__(self, data):
		self.data = data
		self.next = None

class LinkedList():
	def __init__(self):
		self.head = None

	def push(self, data): 
		new_node = Node(data)
		new_node.next = self.head
		self.head = new_node

	def append(self,data):
		new_node = Node(data)
		if self.head == None:
			self.head = new_node
		else:
			current = self.head
			while current.next:
				current = current.next
			current.next = new_node

	def length(self):
		current = self.head
		count = 0
		while current:
			count += 1
			current = current.next
		return count

	def printLinkedList(self):
		current = self.head
		print("The LinekedList is: ")
		while current:
			print(current.data)
			current = current.next
		print("\n")


''' Driver Code '''

print("\n\nImplement a Single Linked List\n")
ll = LinkedList()

ll.push(15)
ll.push(30)
ll.push(45)
ll.append(5)
print("length of the list is: " + str(ll.length()))
ll.printLinkedList()