class Node:
	def __init__(self, data):
		self.data = data
		self.next = None
 
class Stack:
	def __init__(self):
		self.head = None
	def isEmpty(self):
		if self.head == None:
			return True
		else:
			return False
	def push(self, data):
		if self.head == None:
			self.head = Node(data)
		else:
			newnode = Node(data)
			newnode.next = self.head
			self.head = newnode
	def pop(self):
		if self.isEmpty():
			return None
		else:
			popednode = self.head
			self.head = self.head.next
			popednode.next = None
			return popednode.data
	def peek(self):
		if self.isEmpty():
			return None
		else:
			return self.head.data
	def display(self):
		node = self.head
		if self.isEmpty() == False:
			while node != None:
				print(node.data, '->', end=' ')
				node = node.next
#Driver Code
a_stack = Stack()
while True:
	print('push <value>')
	print('pop')
	print('print')
	print('quit')
	
	do = input('What would you like to do? ').split()
	operation = do[0].strip().lower()
	if operation == 'push':
		a_stack.push(int(do[1]))
	elif operation == 'pop':
		popped = a_stack.pop()
		if popped is None:
			print('Stack is empty.')
		else:
			print('Popped value: ', int(popped))
	elif operation == 'print':
		a_stack.display()
	elif operation == 'quit':
		break	