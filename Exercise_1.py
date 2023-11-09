class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
      self.stack = []
         
     def isEmpty(self):
      return self.stack == []
         
     def push(self, item):
      self.stack.append(item)
      print("Inserted {} and the current stack is {}" .format(item, self.stack))
         
     def pop(self):
        if (not self.isEmpty()):
          removeitem = (self.stack[-1])
          del(self.stack[-1])
          return print("Removed item {}".format(removeitem))
        else:
          return ("Stack is empty")
        
     def peek(self):
      if (not self.isEmpty()):
        return self.stack[-1]
        
     def size(self):
      return len(self.stack)
      
         
     def show(self):
      print("Current stack {}" .format(self.stack))
         

s = myStack()
s.push('1')
s.push('2')
s.pop()
s.show()
