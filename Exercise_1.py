class myStack:
    def __init__(self):
    	self.arr=[]
         
    def isEmpty(self):
    	if len(self.arr)==0:
    		return True
    	else:
    		return False
         
    def push(self, item):
    	self.arr.append(item)
         
    def pop(self):
    	if len(self.arr)==0:
    		print("Stack Underflow")
    		return 0
    	else:
    		return self.arr.pop() 
        
    def peek(self):
    	if len(self.arr)==0:
    		print("Empty Stack")
    		return 0
    	else:
    		return self.arr[-1]
    
    
    def size(self):
    	return len(self.arr)
         
    def show(self):
    	return(self.arr)
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
