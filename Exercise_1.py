class MyStack:
    def __init__(self):
        self.stack_implement = []

    def is_empty(self):
        return self.stack_implement is None

    def push(self, item):
        self.stack_implement.append(item)

    def pop(self):
        self.stack_implement.pop()

    def peek(self):
        return self.stack_implement[len(self.stack_implement) - 1]

    def size(self):
        return len(self.stack_implement)

    def show(self):
        return self.stack_implement


s = MyStack()
s.push('1')
s.push('2')
print(s.is_empty())
print(s.size())
print(s.pop())
print(s.show())
