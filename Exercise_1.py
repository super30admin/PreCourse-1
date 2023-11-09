# Time Complexity : isEmpty(): O(1)
#                   push(): O(1) // but in cases where list size increases beyond allocated memory then O(n)
#                   pop(): O(1)
#                   peek(): O(1)
#                   size(): O(1)
#                   show(): O(1)
# Space Complexity : O(n)

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
        self.stack = []
        self.size = 0
         
     def isEmpty(self):
        return self.size == 0
         
     def push(self, item):
        self.stack.append(item)
        self.size += 1
         
     def pop(self):
        if self.isEmpty():
           print("Stack underflow")
           return 0
        self.size -= 1
        return self.stack.pop()
        
     def peek(self):
        if self.isEmpty():
           print("Stack underflow")
           return 0
        return self.stack[-1]
        
     def size(self):
        return self.size
         
     def show(self):
        return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.pop())
print(s.peek())
print(s.show())
