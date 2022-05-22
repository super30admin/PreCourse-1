"""
Leetcode: NA
TC/SC - refer below
Challenge - pop on empty stack
"""
class myStack:
    # Please read sample.java file before starting.
    # Kindly include Time and Space complexity at top of each file
    def __init__(self):
        self.arr = []

    # TC - O(N), SC - O(1)
    def isEmpty(self):
        return len(self.arr) == 0

    # TC - O(N), SC - O(1)
    def push(self, item):
        self.arr.append(item)

    # TC - O(N), SC - O(N)
    def pop(self):
        if (self.isEmpty()):
            return ValueError('ERROR: Empty stack cannot perform pop')
        poppedElement = self.arr[-1]
        self.arr = self.arr[:-1]
        return poppedElement

    # TC - O(1), SC - O(1)
    def peek(self):
        return self.arr[-1]

    # TC - O(N), SC - O(1)
    def size(self):
        return len(self.arr)

    # TC - O(1), SC - O(1)
    def show(self):
        return self.arr


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
