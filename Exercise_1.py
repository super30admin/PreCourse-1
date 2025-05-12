class myStack:
    # Please read sample.java file before starting.
    # Kindly include Time and Space complexity at top of each file
    # TC -> all the operations as O(1)
    # SC -> O(N) where N is the number of elements in the stack
    # No problems faced.
    def __init__(self):
        self.stack = []

    def isEmpty(self):
        if len(self.stack) == 0:
            return True
        else:
            return False

    def push(self, item):
        self.stack.append(item)

    def pop(self):
        if not self.isEmpty():
            return self.stack.pop()
        else:
            return "Stack empty"

    def peek(self):
        if not self.isEmpty():
            return self.stack[-1]
        else:
            return "Stack empty"

    def size(self):
        return len(self.stack)

    def show(self):
        return self.stack


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
