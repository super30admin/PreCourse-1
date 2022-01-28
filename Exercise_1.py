# Time Complexity: O(1) for isEmpty(), push(), pop(), size(), peek(); O(n) for show()
# Space Complexity: O(n)
# Did this code successfully run on Leetcode?: Ran succesfully on code editor
# Any problem you faced while coding this: No


class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
       self.stack = []
         
     def isEmpty(self):
       if len(self.stack) == 0:
         return ("Stack is empty")
       else:
         return ("Stack is not empty")
      
     def push(self, item):
        return self.stack.append(item)
      
     def pop(self):
        return ("Popped element is: " +str(self.stack.pop()))
        
     def peek(self):
        if self.stack:
          return ("Peek of the stack is: " +str(self.stack[-1]))
      
     def size(self):
         return ("Length of stack is: " +str(len(self.stack)))
       
     def show(self):
         return ("Stack is: " +str(self.stack))

s = myStack()
print(s.isEmpty())
s.push('1')
s.push('2')
print(s.size())
print(s.peek())
s.push('3')
s.push('4')
print(s.pop())
print(s.show())
print(s.isEmpty())
