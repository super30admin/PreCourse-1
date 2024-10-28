# Time Complexity : O(1) for isEmpty, push, pop, peek, size
# Space Complexity : O(n) for storing elements in stack
class myStack:
    # Please read sample.java file before starting.
    # Kindly include Time and Space complexity at top of each file
    def __init__(self):
        self.stack = []
        self.count = 0

    def isEmpty(self):
        return self.count == 0

    def push(self, item):
        self.stack.append(item)
        self.count += 1

    def pop(self):
        if self.count >= 1:
            self.count -= 1
            return self.stack.pop()
        else:
            return None

    def peek(self):
        return self.stack[-1] if not self.isEmpty() else None

    def size(self):
        return self.count

    def show(self):
        return self.stack


s = myStack()
s.push("1")
s.push("2")
print(s.pop())
print(s.show())
