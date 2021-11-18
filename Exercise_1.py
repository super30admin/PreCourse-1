# Time Complexity :
"""
  All the functions will take constant amount of time.
  def __init__, isEmpty, peek, size, show are not dependent on length of the input
  push and pop will take one element as an input at a time so it will take costant time for each operation, 
  so if we want to create a stack of n elements then push and pop will vary linearly and hence their Time complexity will be O(n) 
"""
# Space Complexity :
 
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  # Your code here along with comments explaining your approach
     def __init__(self):
         '''Create an empty list'''
         self.stack = [] 

     def isEmpty(self):
        '''Check if list is empty, if list is empty then return True else False'''
        return self.stack == []
   
     def push(self, item):
       '''Append the item in the list'''
       self.stack.append(item)
         
     def pop(self):
        '''pop the last element in the stack'''
        if not self.isEmpty():
          return self.stack.pop()
        
     def peek(self):
       '''Return the top element of the stack'''
       return self.stack[-1]
        
     def size(self):
       '''Return the length of the stack'''
       return len(self.stack)
         
     def show(self):
       '''Return the stack for display'''
       return self.stack
         

s = myStack()
print(s.isEmpty())
s.push('1')
s.push('2')
print(s.show())
print(s.pop())
print(s.show())
