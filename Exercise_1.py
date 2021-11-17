class myStack:

    def __init__(self):
        self.arr = []

    def isEmpty(self):
        return len(self.arr) == 0

    def push(self, item):
        self.arr.append(item)

    def pop(self):
        if len(self.arr) != 0:
            return self.arr.pop()
        else:
            return -1

    def peek(self):
        return self.arr[-1]

    def size(self):
        return len(self.arr)

    def show(self):
        return self.arr


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
