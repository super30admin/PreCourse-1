class myStack:
    def __init__(self):
        self.stack = []
    
    def isEmpty(self):
    	"""
    	Time Complexity = O(n)
    	Space Complexity = O(1)
    	"""
        return len(self.stack) == 0
    
    def push(self,item):
    	"""
    	Time Complexity = O(1)
    	Space Complexity = O(1)
    	"""
        self.stack.append(item)
    
    def pop(self):
    	"""
    	Time Complexity = O(1)
    	Space Complexity = O(1)
    	"""
        return(self.stack.pop())
    
    def peek(self):
    	"""
    	Time Complexity = O(1)
    	Space Complexity = O(1)
    	"""
        x = stack[-1]
        return x
    
    def size(self):
    	"""
    	Time Complexity = O(n)
    	Space Complexity = O(1)
    	"""
        return len(self.stack)
    
    def show(self):
    	"""
    	Time Complexity = O(n)
    	Space Complexity = O(1)
    	"""
        print(self.stack)

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
