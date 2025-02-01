# Time Complexity: O(1) for push, pop, peek; O(n) for show
# Space Complexity: O(n) for storing stack elements

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
        return "Stack is empty"

    def peek(self):
        if not self.isEmpty():
            return self.stack[-1]
        return "Stack is empty"

    def size(self):
        return len(self.stack)

    def show(self):
        return self.stack

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
