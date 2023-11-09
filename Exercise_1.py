
# Time Complexity - isEmpty = O(1)
# Time Complexity - push = O(1)
# Time Complexity - pop = O(1)
# Time Complexity - Peek = O(1)
# Time Complexity - Size = O(1)
# Time Complexity - Show = O(1)
# Space Complexity - O(n) where n is the number of elements in stack.
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
        self.stack = []
         
     def isEmpty(self):
         if len(self.stack) == 0:
             return True
         return False
         
     def push(self, item):
         self.stack.append(item)
         print(self.stack)
         
     def pop(self):
         if not self.isEmpty():
            return self.stack.pop()
         else:
             return "Stack is empty"
        
     def peek(self):
         if not self.isEmpty():
            return self.stack[-1]
         else:
             return "Stack is empty"
        
     def size(self):
         return len(self.stack)
         
     def show(self):
         return self.stack      
s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
