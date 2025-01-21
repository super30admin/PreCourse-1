"""
TC: O(1)
SC: O(n)
"""


class myStack:
    def __init__(self):
        self.aStack = []

    def isEmpty(self):
        return self.aStack == []

    def push(self, item):
        self.aStack.append(item)

    def pop(self):
        if not self.isEmpty():
            return self.aStack.pop()
        else:
            raise IndexError("Stack is empty")

    def peek(self):
        if not self.isEmpty():
            return self.aStack[-1]
        else:
            raise IndexError("Stack is empty")

    def size(self):
        return len(self.aStack)

    def show(self):
        return self.aStack


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
