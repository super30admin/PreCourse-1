class myStack:
    def __init__(self):
        self.stack=list()
    def isEmpty(self):
        if len(self.stack)==0:
            return False
        return True

    def push(self, item):
        self.stack.append(item)

    def pop(self):
        return self.stack.pop()

    def peek(self):
        return self.stack[len(self.stack)-1]

    def size(self):
        return len(self.stack)

    def show(self):
        return self.stack[len(self.stack) - 1]
         
s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
