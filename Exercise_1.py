# Implement Stack using Arrays
# Time complexity -
# Push operation - O(1) -- element is added to the end.
# Pop operation - O(1) -- element is added at the end.
# isEmpty, peek, size, show - O(1)
# 

class myStack:
     def __init__(self):
          '''
               Initialize your stack here.
          '''
          self.stack = []
          self.size = 0

     def isEmpty(self):
          ''' 
               Check whether the stack is empty.
          '''
          return self.size == 0
         
     def push(self, item):
          '''
               Push the element in the stack.
          '''
          self.size += 1
          self.stack.append(item)
         
     def pop(self):
          ''' 
               Pop the element from the stack.
          '''
          # if the stack is empty, no elements to pop.
          if not self.size:
               raise Exception('Stack is empty.')
          return self.stack.pop()
        
     def peek(self):
          ''' 
               Print the top most element of the stack.
          '''
          if not self.size:
               raise Exception('Stack is empty.')
          return self.stack[self.size-1]
        
     def size(self):
          '''
               Check the size of stack.
          '''
          return self.size
         
     def show(self):
          '''
               Print the elements of the stack.
          '''  
          return self.stack

s = myStack()
s.push('1')
s.push('2')
s.push('3')
s.push('4')
print(s.pop())
print(s.show())
