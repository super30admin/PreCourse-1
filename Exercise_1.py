class myStack:
    def __init__(self):
        self.s = []

    def isEmpty(self):

        if len(self.s) == 0:
            return True

        else:
            return False

    def push(self, item):
        self.s.append(item)

    def pop(self):

        return self.s.pop()

    def peek(self):
        return self.s[0]

    def size(self):

        return len(self.s)

    def show(self):

        return self.s


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
