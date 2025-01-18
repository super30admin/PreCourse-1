class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
       self.stack = []
       
     def isEmpty(self):
       return len(self.stack) == 0
       
     def push(self, item):
       self.stack.append(item)
       
     def pop(self):
       if self.isEmpty():
        raise IndexError("Pop from an empty stack")
       return self.stack.pop()
      
     def peek(self):
       if self.isEmpty():
        raise IndexError("Peek from an empty stack")
       return self.stack[-1]
      
     def size(self):
      return len(self.stack)
       
     def show(self):
       if self.isEmpty():
        return "stack is empty"
       else: 
        return f"last element is {self.stack[-1]}"         

s = myStack()
s.push('1')
s.push('2')
print(s.show())
print(s.pop())
