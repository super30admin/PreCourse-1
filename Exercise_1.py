class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  # time complexity o(1)
  #  space o(n) n is number of elements in stack
     def __init__(self):
       self.stack = []
         
     def isEmpty(self):
       return len(self.stack) ==0
         
     def push(self, item):
      self.stack.append(item)
         
     def pop(self):
       self.stack.pop()
        
     def peek(self):
       self.stack.peek()
        
     def size(self):
       return len(self.stack)
         
     def show(self):
       return self.stack
         

s = myStack()
s.push('1') 
s.push('2')
print(s.pop())  #output 2
print(s.show()) #output 1 
