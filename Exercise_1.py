class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
          """
          Time complexity: O(1)
          Space complexity: O(1)
          """
          self.stackk = []
         
     def isEmpty(self):
          """
          Time complexity: O(1)
          Space complexity: O(1)
          """
          return not self.stackk
         
     def push(self, item):
          """
          Time complexity: O(1)
          Space complexity: O(1)
          """
          self.stackk.append(item)
         
     def pop(self):
          """
          Time complexity: O(1)
          Space complexity: O(1)
          """
          if self.isEmpty():
               print('Stack Underflow')
               return 0
          return self.stackk.pop()

     def peek(self):
          """
          Time complexity: O(1)
          Space complexity: O(1)
          """
          if self.isEmpty():
               print('Stack is empty!')
               return 0
          return self.stackk[-1]
        
     def size(self):
          """
          Time complexity: O(1)
          Space complexity: O(1)
          """
          return len(self.stackk)
         
     def show(self):
          """
          Time complexity: O(N) since I'm accessing every element in the stack
          Space complexity: O(N) since I'm storing all the elements of the stack in a separate memory location
          """
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