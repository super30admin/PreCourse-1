class myStack:
     def __init__(self):
        self.stack = []
         
     def isEmpty(self):
        if(self.stack==[]):
            return True
        return False
         
     def push(self, item):
        self.stack = [item] + self.stack
         
     def pop(self):
        if(not self.isEmpty()):
            top = self.stack[0]
            self.stack = self.stack[1:]
            return top
        return None
        
     def peek(self):
        if(not self.isEmpty()):
            return self.stack[0]
        return None

     def size(self):
        return len(self.stack)
         
     def show(self):
        return self.stack
         
s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())