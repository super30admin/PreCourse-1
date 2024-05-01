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
        cur = self.stack.pop()
        return cur

    def peek(self):
        return self.stack[-1]

    def size(self):
        return len(self.stack)

    def show(self):
        result = []
        for index in range(len(self.stack) - 1, -1, -1):
            result.append(self.stack[index])
        return result


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
