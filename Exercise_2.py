
class Node:
	def __init__(self, data):
	self.data = data
	self.next = None
	
	
	class Stack:
	# initializing the head to None
	def __init__(self):
	self.head = None
	
	# push a node by checking the list, if None, then new node is the head
	def push(self, data):
	new_node = Node(data)
	if self.head is None:
	self.head = new_node
	else:
	# else, add the new nodes at the start of the head, and make the new node as the head
	new_node.next = self.head
	self.head = new_node
	
	def pop(self):
	# In order to pop, we check if the list is empty of not
	if self.head is None:
	return None
	else:
	# remove the first node from the head as Stack is LIFO, then increment the head node to it's next
	removed_node = self.head.data
	self.head = self.head.next
	return removed_node
	
	
	a_stack = Stack()
	while True:
	# Give input as string if getting an EOF error. Give input like "push 10" or "pop"
	print('push <value>')
	print('pop')
	print('quit')
	do = input('What would you like to do? ').split()
	# Give input as string if getting an EOF error. Give input like "push 10" or "pop"
	operation = do[0].strip().lower()
	if operation == 'push':
	a_stack.push(int(do[1]))
	elif operation == 'pop':
	popped = a_stack.pop()
	if popped is None:
	print('Stack is empty.')
	else:
	print('Popped value: ', int(popped))
	elif operation == 'quit':
	break
