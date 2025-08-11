# Time Complexity : O(1)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : N/A
# Any problem you faced while coding this : No

#Your code here along with comments explaining your approach
#  Used list for stack storage.
#  Checked empty before pop/peek.




class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
        self.stack = [] #used list
         
     def isEmpty(self):
        return len(self.stack) == 0 #checks if stacks is empty
         
     def push(self, item):
        return self.stack.append(item) #add item to top of stack
         
     def pop(self):
        if self.isEmpty():  # avoid popping from empty stack
           return "Stack is empty"
        return self.stack.pop()  # remove and return top item

     def peek(self):
        if self.isEmpty():  # avoid peeking empty stack
           return "Stack is empty"
        return self.stack[-1]  # return top item without removing
        
     def size(self):
        return len(self.stack)  # return number of elements
         
     def show(self):
        return self.stack.copy() # return copy to protect internal data
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
