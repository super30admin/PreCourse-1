# Exercise_1 : Implement Stack using Array.
# Time Complexity: O(1)
# Space Complexity: O(N), N = length of the stack 
# Successful Run on Leetcode: N/A
# Challenges: None

class myStack:

     def __init__(self):
      # initializating the stack using array
      self.stack = []
         
     def isEmpty(self):
      # if the length of the stack is zero, then the stack is empty
      return len(self.stack) == 0
         
     def push(self, item):
      # adding item to stack by appending the item at the end of the array
      self.stack.append(item)
         
     def pop(self):
      # since the last item in the array represents the top most element of the stack, we pop the last element
      self.stack.pop()
        
     def peek(self):
      # since the last item in the array represents the top most element of the stack, it is the peek of the stack
      return self.stack[-1]
        
     def size(self):
      # length of stack = length of the array
      return len(self.stack)
         
     def show(self):
      # return the stack 
      return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
print(s.isEmpty())
print(s.peek())
s.push('3')
s.push('4')
print(s.show())
s.push('5')
print(s.isEmpty())
print(s.peek())
s.push('6')
print(s.show())
