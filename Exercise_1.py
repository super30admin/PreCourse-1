class myStack:
    def __init__(self):
        self.top = -1
        self.max_length = 100
        self.a = [0 for _ in range(self.max_length)]  # Using a sample length of 100 to simulate overflow errors.

    def isEmpty(self):
        if self.top == -1:
            return True
        else:
            return False
    def push(self, item):
        if self.top == self.max_length - 1:
            raise IndexError("Overflow Error")
        self.top+=1
        self.a[self.top] = item
    def pop(self):
        if self.top == -1:
            raise IndexError("Underflow Error")
        self.top -= 1
        return self.a[self.top+1]
    def peek(self):
        if self.top == -1:
            return "Empty Stack"
        else:
            return self.a[self.top]
    def size(self):
        return self.top 
    def show(self):
        if self.top == -1:
            return "Stack Empty"
        return '>>' + '->'.join(self.a[:self.top+1]) + '<-TOP'

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
