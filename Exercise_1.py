"""
Time Complexity:
- push: O(1)
- pop: O(1)
- peek: O(1)
- size: O(1)

Space Complexity:
- O(n) where n = capacity
- Here capacity is fixed at 10000, so space complexity is O(1) in practical terms.

Simple fixed-capacity stack implementation.
"""

class myStack:
    # Please read sample.java file before starting.
    # Kindly include Time and Space complexity at top of each file
    def __init__(self, capacity=10000):
        self.capacity = capacity
        self.stack = [None] * capacity
        self.top = -1

    def isFull(self):
        return self.top == self.capacity - 1

    def isEmpty(self):
        return self.top == -1

    def push(self, item):
        if self.isFull():
            raise OverflowError("Stack is full. Stack Overflow")
        self.top += 1
        self.stack[self.top] = item

    def pop(self):
        if self.isEmpty():
            raise IndexError("Stack is empty. Stack Underflow")
        item = self.stack[self.top]
        self.stack[self.top] = None
        self.top -= 1
        return item

    def peek(self):
        if self.isEmpty():
            raise IndexError("Stack is empty.")
        return self.stack[self.top]

    def size(self):
        return self.top + 1

    def show(self):
        return [self.stack[i] for i in range(self.top + 1)]


if __name__ == "__main__":
    s = myStack()
    s.push('1')
    s.push('2')
    print(s.pop())
    print(s.show())
