class myStack:
    def __init__(self):
        self.stackArr = []

    def isEmpty(self):
        return self.size() == 0

    def push(self, item):
        self.stackArr.append(item)

    def pop(self):
        if self.isEmpty():
            return None
        return self.stackArr.pop()

    def peek(self):
        if self.isEmpty():
            return None
        return self.stackArr[-1]

    def size(self):
        return len(self.stackArr)

    def show(self):
        if self.isEmpty():
            print("The stack is empty")
            return
        for i in self.stackArr:
            print(i)


s = myStack()
s.show()
s.push('1')
s.push('2')
s.push('3')
s.show()
s.pop()
s.show()
