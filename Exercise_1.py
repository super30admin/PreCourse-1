# Time Complexity : O(1)
# Space Complexity : 0(1)

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
          self.my_stack = [] # initialize the my_stack array
         
     def isEmpty(self):
          return len(self.my_stack) == 0 # return TRUE if the my_stack is empty
         
     def push(self, item):
          self.my_stack.append(int(item))     # convert the string item into int and append it in the stack
         
     def pop(self):
          if self.isEmpty():            # check if Empty return NONE
             return None
          return self.my_stack.pop()   #  pop the top item of the stack
        
        
     def peek(self):
          if self.isEmpty():            # check if Empty return NONE
            return None
          return self.my_stack[-1]      # show the top most value of the array
        
     def size(self):
         return print("Size of my_stack : ",len(self.my_stack))  #print the length of the stack
         
     def show(self):               
         if (self.my_stack != None):         # if there is some value in the stack return the value
          return self.my_stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())


# Time Complexity : O(1)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Did not try
# Any problem you faced while coding this : Yes type conversion
