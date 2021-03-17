class myStack:
    def __init__(self):
        self.s = []

    def isEmpty(self):
        if len(self.s) == 0:
            return True
        return False

    def push(self, item):
        self.s.append(item)

    def pop(self):
        if s.isEmpty():
            raise Exception('Cannot pop from empty stack!')
        else:
            return self.s.pop()

    def peek(self):
        return self.s[-1]

    def size(self):
        return len(self.s)

    def show(self):
        st = []
        for i in self.s:
            st.append(i)
        return st


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
