# Time Complexity : push -> O(1), pop -> O(1), peek -> O(1), is_empty -> O(1), size -> O(1), show -> O(n)
# Space Complexity : 0(1) since max it can go is maxsize (1000)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Minor bugs

class my_stack:
	
	def __init__(self):
    	# stack implmented as list in python with given size
		self.maxsize=1000
		self.stack=[]
		self.error_message="Stack overflow"
        
	def is_empty(self):
		# if list is empty
		if not self.stack:
			return True
		return False
		
	def push(self, item):
		# append list to push
		if self.size() < self.maxsize:
			self.stack.append(item)
		else:
			return self.error_message

	def pop(self):
		# pop from list to remove last item
		if self.size():
			return self.stack.pop()
		else:
			return self.error_message

		
		
	def peek(self):
		# return topmost element
		if self.size():
			return self.stack[-1]
		else:
			return self.error_message
    
	def size(self):
		# return current len of stack
		return len(self.stack)
  
	def show(self):
		# print all elements in the stack
		if not self.size():
			return self.error_message
		for i in range(self.size()):
			print(self.stack[i], end=" ")


      

s = my_stack()
s.push('1')
s.push('2')
print(s.pop())
print(s.pop())
print(s.pop())
print(s.peek())
print(s.size())
print(s.is_empty())




