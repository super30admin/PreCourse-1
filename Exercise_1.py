class myStack:
    def __init__(self):
        self.data = []


    def isempty(self):
        if len(self.data) == 0:
            return 0

    def push(self, e):
        self.data.append(e)

    def pop(self):
        if self.isempty() == 0:
            return print("Can't pop from an Empty Stack")

        return self.data.pop()

    def peek(self):
        if self.isempty() ==0:
            return print("Stack is Empty")
        else:
            return self.data[-1]

    def size(self):
         return len(self.data)

    def show(self):
         return self.data
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
