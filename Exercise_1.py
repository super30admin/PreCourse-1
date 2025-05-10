# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : 
# // Any problem you faced while coding this :



class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
         self.stack=[]
    
     def isEmpty(self):
          # Check if stack is empty
          return len(self.stack)==0
         
     def push(self, item):
         # Adding element to the stack
         self.stack.append(item)
     
     def pop(self):
        # Removing element from stack
        return self.stack.pop()
        
     def peek(self):
         # Retrieving the top element
         return self.stack[-1]
        
     def size(self):
         # Getting the length of the stack
         return len(self.stack)
         
     def show(self):
         # Print the stack
         return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())