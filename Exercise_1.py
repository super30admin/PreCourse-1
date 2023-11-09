#Author: Vineet Khanna
#Implementing stack using list data structure
#Facing some problems with evaluating space complexities.

class myStack:
	l1 = []

	def __init__(self):
		pass

	# TC: O(1)
	def isEmpty(self):
		if len(myStack.l1)==0:
			return False
		return True
	
	# TC: O(1)
	def push(self, item):
		myStack.l1.append(item)

	# TC: O(1)
	def pop(self):
		if len(myStack.l1)!=0:
			return myStack.l1.pop()

	# TC: O(1)
	def peek(self):
		return myStack.l1[0]

	# TC: O(1)
	def size(self):
		return len(myStack.l1)

	# TC: O(1)
	def show(self):
		return myStack.l1

		 

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
