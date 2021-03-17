class myStack:
    def __init__(self):
        self.stack = []

    def isEmpty(self):
        if len(self.stack) == 0:
            return True
        return False

    def push(self, item):
        self.stack.append(item)

    def pop(self):
        if s.isEmpty():
            raise Exception('Cannot pop from empty stack!')
        else:
            return self.stack.pop()

    def peek(self):
        return self.stack[-1]

    def size(self):
        return len(self.stack)

    def show(self):
        st = []
        for i in self.stack:
            st.append(i)
        return st


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
