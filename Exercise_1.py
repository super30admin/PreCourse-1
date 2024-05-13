# Time Complexity:
# push: O(1)
# pop: O(1)
# peek: O(1)
# size: O(1)
# isEmpty: O(1)
# show: O(n) where n is the number of elements in the stack
# Space Complexity:
# O(n) where n is the number of elements in the stack

class myStack:
    def __init__(self):
        self.stack = []
        
    def isEmpty(self):
        return len(self.stack) == 0
    
    def push(self, item):
        self.stack.append(item)
        
    def pop(self):
        if not self.isEmpty():
            return self.stack.pop()
        else:
            return "Stack is empty"
        
    def peek(self):
        if not self.isEmpty():
            return self.stack[-1]
        else:
            return "Stack is empty"
        
    def size(self):
        return len(self.stack)
    
    def show(self):
        return self.stack

# Test the myStack class
s = myStack()
s.push('1')
s.push('2')
print(s.pop())  
print(s.show())