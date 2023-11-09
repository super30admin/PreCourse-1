class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
       self.stack=list()

     # O(1) Time Complexity    
     def isEmpty(self):
         if len(self.stack)==0:
           return True
         else:
           return False
    
    # O(1) Time Complexity   
     def push(self, item):
         self.stack.append(item)

    # O(1) Time Complexity
     def pop(self):
        if len(self.stack)>0:
          return self.stack.pop()
        else:
          print('Stack Underflow')
          return 0

    # O(1) Time Complexity
     def peek(self):
        if len(self.stack)>0:
          return self.stack[-1]
        else:
          return None
     
     # O(1) Time Complexity
     def size(self):
        return len(self.stack) 
    
    # O(1) Time Complexity
     def show(self):
         return self.stack

s = myStack()
s.push('1')
s.push('3')
print(s.peek())
print(s.size())
print(s.pop())
print(s.show())
print(s.isEmpty())
