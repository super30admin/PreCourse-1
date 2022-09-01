class myStack:
    def __init__(self):
        self.container = []

    def push(self, item):
        self.container.append(item)

    def pop(self):
        return self.container.pop()

    def peek(self):
        return self.container[-1]

    def size(self):
        return len(self.container)

    def show(self):
        return self.container


if __name__ == '__main__':
    s = myStack()
    s.push('1')
    s.push('2')
    print(s.pop())
    print(s.show())