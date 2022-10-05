# Time Complexity is O(1)
# Space Complexity is O(n) --> no of elements we store in the stack
class myStack:
    def __init__(self):
        self.stack = []
        self._size = 0

    def isEmpty(self):
        return True if self._size == 0 else False

    def push(self, item):
        self.stack.append(item)
        self._size += 1

    def pop(self):
        if not self.isEmpty():
            last = self.stack[-1]
            del (self.stack[-1])
            self._size -= 1
            return last
        else:
            print("Stack is empty")

    def peek(self):
        return self.stack[-1]

    def size(self):
        return self._size

    def show(self):
        return self.stack


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.size())
print(s.show())
