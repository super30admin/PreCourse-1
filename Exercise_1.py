#Time Complexity :
#      isEmpty: O(1)
#      push: O(1)
#      pop: O(1)
#      peek: O(1)
#      size: O(1)
#      show: O(n)
#Space Complexity : O(n)
#Did this code successfully run on Leetcode : did not find this on leetcode
#Any problem you faced while coding this : syntax issues 


#Your code here along with comments explaining your approach

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
          self.stack=[] # define a python list
         
     def isEmpty(self):
          return len(self.stack)==0 # returns true if list is empty
         
     def push(self, item):
          self.stack.append(item) # use the inbuilt append function of list to push elements to the stack
         
     def pop(self):
          if self.isEmpty():
            return "Stack Empty. Nothihg to pop" # sanity check to see if stack is empty, if so give an error
          return self.stack.pop() # if stack is not empty use the inbuilt pop function
        
        
     def peek(self):
          if self.isEmpty():
               return "Stack Empty" # sanity check to see if stack is empty, if so give an error
          return self.stack[-1]     # if the stack is not empty return the last element in the list which would be the first element in a stack
        
     def size(self):
          return len(self.stack) # use the len function to obtain the size
         
     def show(self):
          print("Stack:[bottom->top]") # print the stack horizontally
          return self.stack            # return the list to be printed
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
