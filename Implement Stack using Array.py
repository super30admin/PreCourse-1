class myStack:
    # Please read sample.java file before starting.
    # Kindly include Time and Space complexity at top of each file

    def __init__(self):
        self.items = []

    def isEmpty(self):
        return self.items == []

    def push(self, item):
        self.items.append(item)

    def pop(self):
        return self.items.pop()

    def peek(self):
        return self.items

    def size(self):
        return self.items[len(self.items) - 1]

    def show(self):
        return len(self.items)


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
