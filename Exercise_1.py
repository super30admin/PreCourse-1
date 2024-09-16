# Time Complexity : O(1) for all operations, Except for show() which is O(n)
# Space Complexity : O(n)
# Any problem you faced while coding this : Trying to understand the pre-defined functions initially

# Approach:       
class myStack:
     def __init__(self): #Firstly initialize an empty stack with name self.
      self.stack = []
         
     def isEmpty(self) -> bool: #To check the stack is empty or not using with bool datatype to return true/false.
      return len(self.stack) == 0
         
     def push(self, item): #Using append function we are pushing a new element into the stack.
      return self.stack.append(item)
         
     def pop(self): #Checking if the stack is empty or not, If not then pop the last elemnt from the stack using pop function.
      if not self.isEmpty():
            return self.stack.pop()
      return None
    
     def peek(self): #Checking if the stack is empty or not, If not return the last(peek) element from the stack.
      if not self.isEmpty():
            return self.stack[-1]
      return None
        
     def size(self): #To check the length of stack using len function.
      return len(self.stack)
         
     def show(self): #To display all elements in the stack.
      return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
