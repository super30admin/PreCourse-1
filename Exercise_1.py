# Time Complexity : O(1) for all operations (push, pop, peek, isEmpty, size)
# Space Complexity: O(n) where n is the maximum number of elements that can be stored in the stack
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
# Added comments to explain the approach


class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
      self.stack=[] #Initialization of stack
         
     def isEmpty(self):
      return len(self.stack) == 0 #Checking if the stack is empty by using len() function
         
     def push(self, item):
      self.stack.append(item) #Appending the item into the stack using the append() fuction for arrays
         
     def pop(self):
        if not self.isEmpty():  #First checking if the stack is empty or no, if not we pop the last element using pop() function of arrays
          return self.stack.pop()
        else:
          return "Stack is empty" #If the stack is empty we return the message
        
     def peek(self):
      if not self.isEmpty(): #First checking if the stack is empty or no, if not we return the last element of array
        return self.stack[-1]
      else:
        return "Stack is empty" #If the stack is empty we return the message
        
     def size(self):
      return len(self.stack) #Return the length of the stack using len() function 
         
     def show(self):
      return self.stack #Return the whole stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
