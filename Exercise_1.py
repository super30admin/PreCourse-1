class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
        # Time Complexity: O(1)
        # Space Complexity: O(1)
          self.stack = []
         
     def isEmpty(self):
        # Time Complexity: O(1)
        # Space Complexity: O(1)
        
        if len(self.stack) == 0:
          return True
        else:
          return False
         
     def push(self, item):
        # Time Complexity: O(1)
        # Space Complexity: O(1)
        
        self.stack.append(item)
         
     def pop(self):
        # Time Complexity: O(1)
        # Space Complexity: O(1)
          
        item = self.stack.pop()
        return item
        
     def peek(self):
        # Time Complexity: O(1)
        # Space Complexity: O(1)

        item = self.stack[-1]
        return item
        
     def size(self):
        # Time Complexity: O(1)
        # Space Complexity: O(1)

        s = len(self.stack)
        return s
         
     def show(self):
        # Time Complexity: O(N)
        # Space Complexity: O(N)

        s = self.stack
        return s
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
