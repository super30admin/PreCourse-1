class myStack:

    def __init__(self) -> None:
        self.stack= []
        self.top= -1

    def isEmpty(self):
        if self.top==-1:
            return True
        else:
            return False

    def push(self, item):
        self.item= item
        self.stack.append(item)
        self.top+=1
        return self.stack

    def pop(self):
        self.top-=1
        self.stack.pop()
        return self.stack
        

    def peek(self):
        self.stack[self.top]

    def size(self):
        return len(self.stack)

    def show(self):
        return self.stack
s = myStack()
print(s.push('1'))
print(s.push('2'))
print(s.pop())
print(s.show())
print(s.pop())
print(s.show())