# Time Complexity: push and pop is amortize O(1)
# Space Complexity: O(n), n is the no.of elements in the stack


# Your code here along with comments explaining your approach
"""
stack follows the LIFO principle
I have implemented the stack using list considering list end or right as top of stack
since list append() and pop() has amortize O(1), this is the optimal approach
"""

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
       self._stack = []
         
     def isEmpty(self):
       return len(self._stack) == 0
         
     def push(self, item):
       self._stack.append(item)
         
     def pop(self):
       if not self.isEmpty():
        return self._stack.pop()
       return None
        
        
     def peek(self):
       if not self.isEmpty():
        return self._stack[self.size() - 1]
       return None
        
     def size(self):
       return len(self._stack)
    
         
     def show(self):
       return self._stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
