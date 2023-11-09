""" Time Complexity : o(1)
// Space Complexity : o(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach"""

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
        self.stack= list()
        self.top = -1
         
     def isEmpty(self):
        #check if stack is empty or not by checking if top is Null
        if self.top== -1:
           return True
        else:
           return False
         
     def push(self, item):
        #increment the index and insert at incremented index
        self.top+= 1
        self.stack.insert(self.top, item)
        print("success")
         
     def pop(self):
        #created a temp so that current val of top can be saved there and then we decremented the val of top
        if self.isEmpty()==True:
           return "Already Empty"
        else:
           temp= self.stack.pop(self.top)
           self.top-= 1
           return temp
        
        
     def peek(self):
        #display the val of top
        return self.stack[self.top]

        
     def size(self):
        # calculated the size of stack by adding 1 since array starts from 0
        if self.isEmpty() == True:
           return "Empty Stack"
        else:
           return self.top + 1

         
     def show(self):
        if self.isEmpty()== True:
           return "Empty"
        else:
           return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
