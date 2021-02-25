class myStack:
    def __init__(self):
        self.stack = []

    def isEmpty(self):
        return len(self.stack) == 0

    def push(self, item):
        self.stack.append(item)
        print(item + " pushed to stack ")

    def pop(self):
        if self.stack:
            return self.stack.pop()
        else:
            return -1

    def peek(self):
        if self.stack:
            return self.stack[-1]
        else:
            return -1

    def size(self):
        return len(self.stack)


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
