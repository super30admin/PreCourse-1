class myStack:
    def __init__(self):
        self.stack = []

    def isEmpty(self):
        if not self.stack:
            return True
        return False

    def push(self, item):
        self.stack.append(item)

    def pop(self):
        if self.isEmpty():
            print("Stack Underflow")
            return 0
        return self.stack.pop()

    def peek(self):
        if self.isEmpty():
            print("Stack Underflow")
            return 0
        return self.stack[-1]

    def size(self):
        return len(self.stack)

    # not sure why we have both show() and peek()
    def show(self):
        return self.peek()

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
