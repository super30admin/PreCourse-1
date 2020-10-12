class myStack:
    def __init__(self):
        self.stack = []

    def isEmpty(self):

        if len(self.stack) == 0:
            return True
        else:
            return False

    def push(self, item):

        self.stack.append(item)

    def pop(self):

        if len(self.stack) != 0:

            return self.stack.pop()

    def peek(self):
        if len(self.stack) != 0:
            return self.stack[-1]
        else:
            return -1

    def size(self):
        return len(self.stack)

    def show(self):

        # Not sure what your asking here
        return "PASS"


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
