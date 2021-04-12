"""
Intuition:  Stack utilizes a first in, last out property. 
A top element can be placed at the head of the linked list so that it is easier to access it.
Addition or removal of the top/head element will not cause any changes in the ordering of other elements.

#####################################################################
Push Method: Every new element is inserted at the head
Time Complexity : O(1)
Space Complexity : O(1)
#####################################################################
Pop Method: Element present at the head will be popped
Time Complexity : O(1)
Space Complexity : O(1)
#####################################################################
Peek Method: Value of the element present at the head will be accessed
Time Complexity : O(1)
Space Complexity : O(1)
#####################################################################
IsEmpty Method: Checking if the head is None or not
Time Complexity : O(1)
Space Complexity : O(1)
#####################################################################
"""

class Node:
	def __init__(self, data):
	   self.data = data
	   self.next = None
 
class Stack:
	def __init__(self):
		self.head = None

	def push(self, data):
		#Checking if the list is empty
		if self.head == None:
			self.head = Node(data)
		
		#If the list is not empty
		else:
			newNode = Node(data)
			newNode.next = self.head
			self.head = newNode

	def pop(self):
		#Checking if the list is empty
		if self.head == None:
			return self.head
		
		#If the list has elements
		else:
			deletedNode = self.head
			#Checking if only 1 element is present in the list
			if deletedNode.next == None:
				self.head = None
				return deletedNode.data

			#If the list has multiple elements
			self.head = deletedNode.next
			return deletedNode.data

	def peek(self):
		#If the linked list has 0 elements
		if self.head == None:
			print("The stack is empty! Underflow")
			return None

		#If the linked list has 1 or more elements
		else:
			return self.head.data


	def isEmpty(self):
		return True if self.head == None else False



a_stack = Stack()
while True:
	print('push <value>')
	print('pop')
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
	elif operation == 'quit':
		break
