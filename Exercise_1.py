# Pushing and Popping from the stack are efficient Big O(1) operations since one can do both operations in constant time by accessing top of the stack parameter.

class myStack:
    def __init__(self):
        self.stack = []                 # Initialize an empty stack

    def isEmpty(self):
        return len(self.stack) == 0     # If Stack is empty, return True

    def push(self, item):
        self.stack.append(item)         # Push values to the top of the stack

    def pop(self):
        if len(self.stack) != 0:
          self.stack.pop()              # Pop values from the stack in Last In First Out Manner
          return self.stack
        else:
          return "Stack is empty"

    def peek(self):
        if len(self.stack) != 0:
          return self.stack[-1]         # Returns last pushed value in the stack
        else:
          return "Stack is empty"

    def size(self):
        return len(self.stack)          # Returns number of values in the stack

    def show(self):
      if len(self.stack) != 0:
        return self.stack               # List values in the stack
      else:
        return "Stack is empty"

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())