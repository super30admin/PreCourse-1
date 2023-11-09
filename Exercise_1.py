class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
          self.top = -1
          self.max = 100
          self.data = []
         
     def isFull(self):
          if self.top == self.max:
               return True
          return False
     
     def isEmpty(self):
          if self.top == -1:
               return True    
          return False
         
     def push(self, item):
          # Check if stack is full
          if self.isFull():
               return "Stack overflow"
          
          self.data.append(item)
          self.top += 1
         
     def pop(self):
        # Check if stack is empty
          if self.isEmpty():
             return "Stack is empty"
          self.data.pop()
          self.top -= 1
          

     def peek(self):
          if self.isEmpty():
                 return "Stack is empty"
          return self.data[self.top]
        
     def size(self):
          return "Size of stack is {}".format(len(self.data))

     def show(self):
          return "Stack is {}".format(self.data)
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
print(s.peek())
