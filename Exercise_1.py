class myStack:
     
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file

  
  # Time complexity of written code is O(n)
  # Space complexity of written code is O(n)
     def __init__(self):
        self.stack=[]
         
     def isEmpty(self):
       return self.stack == []
       
     def push(self, item):
       self.stack.append(item)

     def pop(self):
        if len(self.stack) <= 0:
          raise Exception('Stack underflow')
        else:
          return self.stack.pop()
        
     def peek(self):
        if len(self._stack) <= 0:
          raise Exception('Stack underflow')
        else:
          return self._stack[-1]
        
     def size(self):
         return   len(self.stack)
     
     def show(self):
        print(self.stack)
   

s = myStack()
s.push('1')
s.push('2')
s.push('3')
s.push('4')
print(s.pop())
print(s.show())
