class myStack:

     def __init__(self):
      self.stack = [] #initilize stack
      self.pointer = 0
         
     def isEmpty(self):
      return (self.size == 0)  
         
     def push(self, item):
      self.stack.append(item) # this takes the element(item) and adds to the stack
      self.pointer=-1
         
     def pop(self):
      if self.isEmpty():  
        return None
      else:
          self.pointer -= 1
          return self.stack.pop()
        
     def peek(self):
      if self.isEmpty():
        return None
      else
        return self.stack[-1] #see top most value of stack

     def size(self):
      return self.pointer
         
     def show(self):
      return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
