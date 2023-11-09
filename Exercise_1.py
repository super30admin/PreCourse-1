# Time Complexity : O(1)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
#Any problem you faced while coding this : no 


#Your code here along with comments explaining your approach



class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
    #declare an empty stack
    def __init__(self, top = None):
      self.stack = []

    #check if stack is empty. it returns bool value
    def isEmpty(self):
      return self.stack == []

    #append to push item in stack
    def push(self, item):
      self.stack.append(item)

    #pop to get last item . LIFO 
    def pop(self):
      return self.stack.pop()
    
    #get the last item
    def peek(self):
      return self.stack[-1]

    #use len to get the size of the stack
    def size(self):
      return len(self.stack)
         
    #print to get the entire stack
    def show(self):
      return(self.stack)
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
