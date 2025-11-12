
### Stack with array


class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
         self.stack = []
         self.MAX = 5

         
     def size(self):
         return len(self.stack)
         #Time complexity O(1)
    
         
     def isEmpty(self):
         if self.size()==0:
             return True
         else:
            return False
          #Time complexity O(1)
    
         
     def push(self, item):
         if self.size()!=self.MAX:
             self.stack.append(item)
         else:
             print("Stack is full")
         return self.stack
         #Time complexity O(1)

         
     def pop(self):
         if not self.isEmpty():
             p=self.stack.pop()
             return p
         else:
             print("Stack is empty")
             return None
          #Time complexity O(1)

        
        
     def peek(self):
         if not self.isEmpty():
             return self.stack[-1]
         else:
             return None
          #Time complexity O(1)
    
         
     def show(self):
         return self.stack
         #Time complexity O(1)
# Space Complexity: O(n)     

s = myStack()
s.push('1')
s.push('2')
s.push('3')
s.push('4')
s.push('5')
s.push('6')


print(s.pop())
print(s.pop())
print(s.pop())
print(s.pop())



print(s.show())
print(s.peek())


