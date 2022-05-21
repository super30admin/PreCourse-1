# Time Complexity: O(1)
# Space Complexity: O(n)

class myStack:
    # Please read sample.java file before starting.
    # Kindly include Time and Space complexity at top of each file
    def __init__(self):
        self.stack = []

    def isEmpty(self):
        return len(self.stack) == 0

    def push(self, item):
        self.stack.append(item)

    def pop(self):
        x = self.stack[-1]
        self.stack.remove(x)
        return x

    def peek(self):
        return self.stack[-1]

    def size(self):
        return len(self.stack)

    def show(self):
        return self.stack


s = myStack()
s.push(1)
s.push(2)
s.push(100)
print('Stack is', s.show())
print('length is', s.size())
print('popped element is', s.pop())
print(s.show())
print('peeked element is', s.peek())
print('Stack is', s.show())
print(s.isEmpty())
s.pop()
s.pop()
print(s.isEmpty())

