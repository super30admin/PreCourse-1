'''
====== Submission Details =======
Student Name: Pavan Kumar K. N.
Email       : pavan1011@gmail.com
S30 SlackID : RN32MAY2021
=================================
'''
import sys
EMPTY_STACK = -sys.maxsize

class myStack:
    def __init__(self):
        self.stack = []
    
    def isEmpty(self):
        return len(self.stack) == 0

    def push(self, item):
        self.stack.append(item)

    
    def pop(self):
        if(self.isEmpty()): #Handling underflow
            return EMPTY_STACK  #Can return default value or throw exception
        else:
            return self.stack.pop() #Normal execution
        
    def peek(self):
        if(isEmpty(self.stack)):
            return EMPTY_STACK #Can return default value or throw exception
        else:
            return self.stack[len(stack) - 1]

    def size(self):
        return len(self.stack)

    def show(self):
        return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())


# print(s.pop())
# print(s.pop())
