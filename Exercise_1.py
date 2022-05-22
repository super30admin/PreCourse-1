# Time Complexity : O(1)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class myStack:
     def __init__(self):
          self.stack = []

     def isEmpty(self):
          return self.stack == [] # check if stack is empty or not

     def push(self, item):
         self.stack.append(item) # append item to the stack

     def pop(self):
        if(self.isEmpty()):
            return("Stack is Already Empty")
        else:
            lastElement = self.stack[-1]
            del(self.stack[-1]) #Remove the last element
            return lastElement # return the deleted element
           

     def peek(self):
        if self.isEmpty():
            return print("Peeking from an empty stack")
        else:
            return self.stack[-1] # return the last element
        
     def size(self):
         return len(self.stack)
         
     def show(self):
         return self.stack

s = myStack()
s.push('1')
s.push('2')
s.push('3')
print(s.peek())
print(s.size())
print(s.pop())
print(s.size())
print(s.peek())
print(s.pop())
print(s.isEmpty())
print(s.pop())
print(s.isEmpty())
print(s.peek())
print(s.pop())
print(s.show())



