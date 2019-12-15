class myStack:
    def __init__(self):
        self.items = []

    def isEmpty(self):
        return len(self.items) == 0

    def push(self, item):
        self.items.append(item)

    def pop(self):
        return self.items.pop()

    def peek(self):
        if len(self.items) == 0:
            return "Stack is empty"
        else:    
            return self.items[-1]

    def size(self):
        return len(self.items)

    def show(self):
        return self.items


s = myStack()
s.push('1')
print(s.show())
s.push('2')
print(s.show())
print(s.pop())
print(s.show())
s.push('3')
print(s.show())
print(s.peek())
print(s.show())
print(s.pop())
print(s.show())
print(s.isEmpty())
print(s.pop())
print(s.isEmpty())
print(s.peek())
