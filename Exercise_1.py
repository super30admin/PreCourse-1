# Time Complexity : isEmpty, push, pop, peek, size, show: O(1)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Couldn't find this code on leetcode
# Any problem you faced while coding this : I want not sure what all edge cases I was suppose to handle.

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
    
    # Initialize stack using a list
    def __init__(self):
       self.st = []

    # Check if stack is empty 
    def isEmpty(self):
       return len(self.st) == 0
          
    # Add item to the top of the stack
    def push(self, item):
       self.st.append(item)

    # Remove and return the top item of the stack, or indicate if empty 
    def pop(self):
       if self.isEmpty():
            return "Stack is empty"
       return self.st.pop()
        
    # Return the top item of the stack without removing it, or indicate if empty
    def peek(self):
       if self.isEmpty():
            return "Stack is empty"
       return self.st[-1]

    # Return the number of items in the stack  
    def size(self):
       return len(self.st)
       
    # Return the current items in the stack  
    def show(self):
       return self.st
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
