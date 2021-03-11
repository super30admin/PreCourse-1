class myStack:
    def __init__(self):
        self.stack = []
        
    def isEmpty(self):
        return len(self.stack) <= 0
    
    def push(self, item):
        self.stack.append(item)
        
    def pop(self):
<<<<<<< HEAD
        self.stack = self.stack[:-1]
        return self.stack[-1]
        # return self.stack.pop()
    
    def peek(self):
=======
        if self.isEmpty():
            return None
        return self.stack.pop()
    
    def peek(self):
        if self.isEmpty():
            return None
>>>>>>> 17a8759 (Completed PreCourse1)
        return self.stack[-1]
    
    def size(self):
        return len(self.stack)
    
    def show(self):
        return self.stack
    
s = myStack()
print(s.size())
print(s.show())
s.push('1')
#print("len", len(s.stack))
#print(s.isEmpty())
s.push('2')

print(s.stack)
print("pop", s.pop())
<<<<<<< HEAD
print("show", s.show())
=======
s.pop()
print(s.peek())
print("show", s.show())
>>>>>>> 17a8759 (Completed PreCourse1)
