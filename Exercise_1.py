class myStack:
    def __init__(self):
        self.max_size = 1000
        self.stack = []
        self.length = 0
         
    def isEmpty(self):
        if  self.length==0:
            return True
        return False
         
    def push(self, item):
        if self.length <= self.max_size:
            self.stack.append(item)
            self.length +=1
            return True
        else:
            return "The stack is full!"

         
    def pop(self):
        if not self.isEmpty():
            self.length -=1
            return self.stack.pop()
        else:
            return "Can't pop from empty stack"
        
    def peek(self):
        if not self.isEmpty():
            return self.stack[-1]
        return "The stack is empty!"
        
    def size(self):
        return self.length
         
    def show(self):
        if not self.isEmpty():
            return self.stack
        else:
            return "Nothing to show!The stack is empty!!"
        

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
