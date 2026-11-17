# Time Complexity: O(1) for push, pop, peek, isEmpty, and size
# Space Complexity: O(n) for storing n elements in the stack

class myStack:
    # Please read sample.java file before starting.
    # Kindly include Time and Space complexity at top of each file

    def __init__(self, limit=1000):
        self.limit = limit
        self.items = []

    def isEmpty(self):
        return len(self.items) == 0

    def push(self, item):
        if len(self.items) >= self.limit:
            raise OverflowError("Stack Overflow")
        self.items.append(item)

    def pop(self):
        if self.isEmpty():
            print("Stack Underflow")
            return None
        return self.items.pop()

    def peek(self):
        if self.isEmpty():
            print("Stack Underflow")
            return None
        return self.items[-1]

    def size(self):
        return len(self.items)

    def show(self):
        return self.items.copy()


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
