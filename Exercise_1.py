# Time complexity: O(1)
# Space complexity: O(n) for n input elements
class myStack:
    # Please read sample.java file before starting.
    # Kindly include Time and Space complexity at top of each file
    def __init__(self):
        self.stack = []

    def isEmpty(self):
        return self.size() == 0

    def push(self, item):
        self.stack.append(item)

    def pop(self):
        if not self.isEmpty():
            return self.stack.pop()
        return -1

    def peek(self):
        if self.stack:
            return self.stack[-1]
        return -1

    def size(self):
        return len(self.stack)

    def show(self):
        return self.stack


s = myStack()
s.push('1')
s.push('2')
print(s.show())
print(s.pop())
print(s.isEmpty())
print(s.pop())
print(s.isEmpty())
print(s.pop())
print(s.show())
