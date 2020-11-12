class myStack:
    def __init__(self):
        stack = []
        self.stack = stack

    def isEmpty(self):
        return not self.stack

    def push(self, item):
        self.stack.append(item)

    def pop(self):
        if self.stack:
            item = self.stack.pop()
            return item
        # print("Cannot remove from empty stack.")
        return None

    def peek(self):
        if self.stack:
            return self.stack[-1]
        # print("Cannot peek into an empty stack.")
        return None

    def size(self):
        return len(self.stack)

    def show(self):
        return self.stack


if __name__ == "__main__":
    s = myStack()
    s.push('1')
    s.push('2')
    print(s.pop())
    print(s.show())