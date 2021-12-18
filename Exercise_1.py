# Time Complexity : don't know how to calculate it in real program
# Space Complexity : don't know
# Did this code successfully run on Leetcode : Yes. 
# Any problem you faced while coding this :
# Didn't knew how to get started, took a peek at others work and experienced a lot on my own
# because I'm a javascript developer and python is new to me
# I know the definition but I don't know how to calculate complexities in real code.

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  
     def __init__(self):
       self.stack = [] # .stack is new method name of self?? we'll init the stack
         
     def isEmpty(self):
       return (True if self.stack == [] else False)
         
     def push(self, item):
       return self.stack.append(item) #append is similar to push in array javascript
         
     def pop(self):
       return self.stack.pop()
     
     def peek(self):
       return self.stack[-1] # peek returns last item
      
     def size(self):
       return len(self.stack)
         
     def show(self):
       return self.stack # return whole stack/list
         

s = myStack()
s.push('1')
s.push('34')
s.push('333')
print("pop", s.pop())
print("show", s.show())
print("peek", s.peek())