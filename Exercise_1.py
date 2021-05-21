from sys import maxsize

class myStack:
    def __init__(self):
        self.stack = list()
        self.max_length = maxsize

    def isEmpty(self):
        return self.stack

    def push(self, item):
        if self.size() >= maxsize:
            return ("Stack size reached its maximum capacity")
        return self.stack.append(item)

    def pop(self):
        if not self.size():
            return ("Stack is empty, nothing to pop")
        return self.stack.pop()

    def peek(self):
        return self.stack[-1]

    def size(self):
        return len(self.stack)

    def show(self):
        return self.stack


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())

"""
n = number of elements in the stack
Space Complexity: O(n) since dynamic list is used. In case a static array is used, space complexity would be constant 
i.e. the size of the max length of the stack

Time Complexity:
isEmpty: O(1)
push: O(n) in worst case and O(1) in amortized time
pop: O(1)
peek: O(1)

"""