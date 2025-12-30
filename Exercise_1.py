# Time Complexity: O(1)
# Space Complexity: O(1)
"""
Init class with empty stack of default size 1000 and starts top with -1
push will increment the top and use that index to add the element
pop will use top val to decrement the index
"""
class myStack:
    def __init__(self, capacity=1000):
        self.stack = [None] * capacity
        self.top = -1

    def isEmpty(self):
        if self.top == -1:
            return True
        return False
         
    def push(self, item):
        if self.top == len(self.stack) - 1:
            return "Stack Overflow"
        self.top += 1
        self.stack[self.top] = item

    def pop(self):
        if self.isEmpty():
            return "Stack Underflow"
        self.top -= 1
        return self.stack[self.top + 1]
        
    def peek(self):
        if self.isEmpty():
            return "Stack Underflow"
        return self.stack[self.top]
        
    def size(self):
        return self.top + 1
         
    def show(self):
        return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
# print(s.show())


