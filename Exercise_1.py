# Time Complexity: O(n) 
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: Yes, on problem 155 - MinStack
# Any problem you faced while coding this: NO

class myStack:
     def __init__(self):
          self.stack = []
         
     def isEmpty(self):
          return len(self.stack) == 0
         
     # time complexity is O(n) amortised as you have to reallocate memory once you reach the specified size(if any)
     def push(self, item):
          self.stack.append(item)  
          return "Successfully pushed item"
          
     def pop(self):
          if self.isEmpty():
               print("No element to pop")
               return 
          else:
               return self.stack.pop()
          
        
     def peek(self):
          if self.isEmpty():
               return "Stack is empty"
          return self.stack[len(self.stack) - 1]
        
     def size(self):
          return len(self.stack)
         
     def show(self):
          if self.isEmpty():
               return 'Stack is empty'      
          else:
               for i in range(len(self.stack)-1, -1, -1):
                    print(self.stack[i])
               return "Succesfully printed stack elements"  

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print('*****')
print(s.show())

