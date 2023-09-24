class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file

  #This implementation ensures that all stack operations (push, pop, peek, isEmpty, size) 
  #have a time complexity of O(1) since they don't depend on the number of elements in the stack. 
  #The space complexity of the stack is O(n), where 'n' is the number of elements in the stack, 
  #as it stores the elements in a list.
  
     def __init__(self):
       self.stack = []
        
     def isEmpty(self):
       return len(self.stack) == 0

     def push(self, item):
       self.stack.append(item)
         
     def pop(self):
        if not self.isEmpty():
            return self.stack.pop()
        else:
            return "Stack is empty"        
        
     def peek(self):
        if not self.isEmpty():
            return self.stack[-1]
        else:
            return "Stack is empty"
        
     def size(self):
        return len(self.stack)
     
     def show(self):
         return self.stack
      
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
