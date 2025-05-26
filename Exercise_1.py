"""
Time Complexity:O(1)

Space Complexity: O(n)

Any problem you faced while coding this:
- Missing indentation and method implementations caused runtime errors.
"""

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
            return "Stack Underflow"

    def peek(self):
        if not self.isEmpty():
            return self.stack[-1]
        else:
            return "Stack is Empty"

    def size(self):
        return len(self.stack)

    def show(self):
        return self.stack