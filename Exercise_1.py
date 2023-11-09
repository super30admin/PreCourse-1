# Tirthaj Rikame
class myStack:
    def __init__(self):
        self.stack = []
        self.top = -1

    def isempty(self):
        if self.top == -1:
            return True
        return False
    def push(self, e):
        if self.top < 4:
            self.stack.append(e)
            print("Pushed element", e)
            self.top += 1
            return
        else:
            print("Stack Overflow")
            return

    def pop(self):
        if self.isempty():
            print("Stack Underflow")
            return
        else:
            tempele = self.stack.pop()
            print("popped element is", tempele)
            self.top -= 1
            return

    def peek(self):
        if self.isempty():
            print("Stack is empty")
            return
        return self.stack[-1]

    def size(self):
        return self.top
    def show(self):
        if self.isempty():
            print("Stack is empty")
            return
        else:
            print(self.stack)

s = myStack()
s.push('1')
s.push('2')
s.push('3')
s.push('4')
s.push('5')
s.push('6')
s.push('7')
print(s.pop())
print(s.pop())
print(s.pop())
print(s.pop())
print(s.pop())
print(s.pop())
print(s.pop())
print(s.pop())

print(s.show())
