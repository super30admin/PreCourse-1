class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
    def __init__(self):
        self.stack = []
    # Time: O(1)    
    def isEmpty(self):
        if len(self.stack) == 0:
            return True
        else:
            return false
     # Time: O(1)     
    def push(self, item):
        self.stack.append(item)
    # Time: O(1)      
    def pop(self):
        return self.stack.pop()
     # Time: O(1)    
    def peek(self):
        return self.stack[-1]
    # Time: O(1) 
    def size(self):
         return len(self.stack)
    # Time: O(1) 
    def show(self):
         return self.stack

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
