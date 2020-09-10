'''
Author : Srinidhi Bhat Brahmavar
'''
'''
Question: Implement Stack using Array 
'''

class myStack:
     def __init__(self):
          self.my_stack = []
     def isEmpty(self):
          return len(self.my_stack) == 0
     def push(self, item):
          self.my_stack.append(item)
     def pop(self):
          return self.my_stack.pop()
     def peek(self):
          return self.my_stack[0]
     def size(self):
          return len(self.my_stack)
     def show(self):
          return (self.my_stack)
          #print(self.my_stack)

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())