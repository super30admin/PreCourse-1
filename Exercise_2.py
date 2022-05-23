#Author: Vineet Khanna
#Implementing stack using linked list


class Node:
	def __init__(self, data):
		self.data = data
		self.next = None


class Stack:
	def __init__(self):
		self.top = None

	# TC: O(1)
	# SC: O(n) ; n number of push done by user.
	def push(self, data):
		if self.top != None:
			node1 = Node(data)
			node1.next = self.top
			self.top = node1
		else:
			self.top = Node(data)
		
	# TC: O(1)
	def pop(self):
		# First, check if the stack is empty return none
		if self.top==None:
			return None
		
		# If not, pop the top element, and adjust top pointer to next
		else:
			pop = self.top
			self.top = self.top.next
			pop.next = None
			return pop.data


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
