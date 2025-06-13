"""
Time and Space complexity for the following methods: 

1) __init__()
Time complexity: O(1)
Space complexity: O(1)

2) push()
Time complexity: O(1)
Space complexity: O(1)

2) pop()
Time complexity: O(1)
Space complexity: O(1)

3) peek()
Time complexity: O(1)
Space complexity: O(1)

4) isEmpty()
Time complexity: O(1)
Space complexity: O(1)

5) size()
Time complexity: O(1)
Space complexity: O(1)

6) show()
Time complexity: O(N) since I'm accessing every element in the stack
Space complexity: O(N) since I'm storing all the elements of the stack in a separate memory location
"""
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
          self.stackk = []
         
     def isEmpty(self):
          return not self.stackk
         
     def push(self, item):
          self.stackk.append(item)
         
     def pop(self):
          if self.isEmpty():
               print('Stack Underflow')
               return 0
          return self.stackk.pop()

     def peek(self):
          if self.isEmpty():
               print('Stack is empty!')
               return 0
          return self.stackk[-1]
        
     def size(self):
          return len(self.stackk)
         
     def show(self):
          if self.isEmpty():
               print('Stack is empty!')
               return 0
          else:
               return self.stackk[:]
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())