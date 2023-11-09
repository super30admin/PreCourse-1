class myStack:

    def __init__(self):
        self.stack = []
        self.len_stack = 0
    def isEmpty(self):
        return self.len_stack == 0
    def push(self,item):
        self.stack.append(item)
        self.len_stack += 1
        return item
    def peek(self):
        if self.isEmpty():
            return -1
        self.stack[-1]
    def size(self):
        return self.len_stack
    def show(self):
        for i in self.stack:
            print(i)
s = myStack()
s.push('1')
s.push('2')
s.show()
