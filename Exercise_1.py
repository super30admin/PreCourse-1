class myStack:
  # Please read sample.java file before starting.
  # Kindly include Time and Space complexity at top of each file
  # Time and Space Complexity =O(1)
    def __init__(self):
        self.stack = []

    def isEmpty(self):
        return self.stack == []

    def push(self, item):
        self.stack.append(item)

    def pop(self):
        return self.stack.pop()

    def peek(self):
        return self.stack[len(self.stack)-1]

    def size(self):
        return len(self.stack)

    def show(self):
        return self.stack


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
