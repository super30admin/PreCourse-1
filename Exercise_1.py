class myStack:
    def __init__(self):
        self._data = []
    def isEmpty(self):
        return len(self._data) == 0
    def push(self, item):
        self._data.append(item)
    def pop(self):
        if self.isEmpty():
            return "Stack is empty"
        return self._data.pop()
    def peek(self):
        if self.isEmpty():
            return 'Stack is Empty'
        return self._data[-1]
    def size(self):
        return len(self._data)
    def show(self):
        return self._data

s = myStack()
#s.push('1')
#s.push('2')
print(s.pop())
print(s.show())
print(s.isEmpty())
s.pop()
print(s.isEmpty())