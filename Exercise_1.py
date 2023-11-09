#Time complexity of all opeartions are O(1)

class myStack:
    def __init__(self):
        self.stack = []
        self.length = 0
    
    def isEmpty(self):
        return self.length == 0
    
    def push(self,item):
        self.stack.append(item)
        self.length += 1
        
    def pop(self):
        if self.length > 0:
            self.length -= 1 
            return self.stack.pop()
        else:
            return "Stack already empty"
            
    def peek(self):
        return self.stack[-1]
    
    def size(self):
        return self.length
    
    def show(self):
        return self.stack



s = myStack()
s.push('1')
s.push('2')
print(s.pop())
s.pop()
print(s.show())
print(s.isEmpty())
print(s.pop())
