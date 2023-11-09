# Program name - Script to implement stack using Array
# Author - Prajakta Pardeshi

# Time complexity for all the operations-
# push - O(1)
# pop - O(1)
# isempty - O(1)
# display - O(n)

# Space complexity for stack using linked list is O(n) where n is the number of elements

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
    def __init__(self):
        self.stack = []
        self.mSize = 10
        self.top = 0
         
    def isEmpty(self):
        if self.top == 0:
            return True
        return False
        
         
    def push(self, item):
        if self.top>=self.mSize:
            return "Cannot insert element stack size is full. Pleas pop to remove"
        self.stack.append(item)
        self.top += 1
        return True
         
    def pop(self):
        if self.top <= 0:
            return "Stack is empty, please add element to pop"
        item = self.stack.pop()
        self.top -= 1
        return item
        
    def peek(self):
        if self.top <= 0:
            return "Stack is empty, so element to peek"
        peek = self.top-1
        item = self.stack[peek]
        return item
        
    def size(self):
        return self.top
         
    def show(self):
        return self.stack
            
        
s = myStack()
s.push('1')
s.push('2')
s.push('3')
s.push('4')
s.push('5')
s.push('6')
s.push('10')
s.push('11')
s.push('12')
print(s.show())
print(s.peek())
print(s.size())
print(s.pop())
print(s.show())
print(s.peek())
print(s.size())