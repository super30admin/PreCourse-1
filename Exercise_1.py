class MyStack:
    # Please read sample.java file before starting.
    # Kindly include Time and Space complexity at top of each file
    def __init__(self):
        self.stack = []

    def is_empty(self):
        return self.stack.count() == 0

    def push(self, item):
        self.stack.append(item)

    def pop(self):
        return self.stack.pop()

    def peek(self):
        return self.stack[-1]

    def size(self):
        return self.stack.count()

    def show(self):
        return self.stack


s = MyStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
