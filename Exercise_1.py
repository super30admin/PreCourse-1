# Time Complexity : Push O(1) POP O(1)
# Space Complexity :O(N)
# Did this code successfully run on Leetcode : 

# Any problem you faced while coding this : 

# Your code here along with comments explaining your approach

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
          self.stack=[]
         
     def isEmpty(self): # checks for empty stack
         if (len(self.stack)):
              return False
         return True
     
     def push(self, item):  # pushes the item using append function
         self.stack.append(item)

     def pop(self): # pops the top element
        if(not self.isEmpty()):
            return self.stack.pop()
        return "stack Empty"
        
     def peek(self):  # returns the top element
         if(not self.isEmpty()):
             return self.stack[-1]
         return "stack emplty"
        
     def size(self):  # returns the size of list
         if(not self.isEmpty()):
             return len(self.stack)
         return "stack empty"
         
     def show(self):  # returns the list
         if(not self.isEmpty()):
             return self.stack
         return "stack Empty"
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
