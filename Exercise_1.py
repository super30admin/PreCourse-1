#Time Complexity : O(1) 
#Space Complexity : O(1) As no extra space is used
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : Indentation issue for this particular file


#Your code here along with comments explaining your approach


class myStack:
#Please read sample.java file before starting.
#Kindly include Time and Space complexity at top of each file
	def __init__(self):
		self.stack = []


	def isEmpty(self):
		'''To check if the stack is empty 
			have checked the length of stack
		'''
		if len(self.stack) == 0:
			return ("Array is empty")
		else:
			return ("Array not empty")
	

	def push(self, item):
		# used append function to add items in the stack
		return self.stack.append(item)
			

	def pop(self):
		# used pop function to delete the items from the stack
		return self.stack.pop()


	def peek(self):
		# to fetch the first element of the stack
		if len(self.stack) == 0:
			return ""
		else:
			return self.stack[-1]

	def size(self):
		return len(self.stack)

	def show(self):
		return self.stack


    

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
