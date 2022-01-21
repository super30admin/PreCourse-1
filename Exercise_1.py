class myStack:
  # Please read sample.java file before starting.
  # Kindly include Time and Space complexity at top of each file

    # Time Complexity : O(1)
    # Space Complexity : O(n)
    # Did this code successfully run on Leetcode : Ran this on VS code
    # Any problem you faced while coding this : No

    def __init__(self):
        self.stack = []

    def isEmpty(self):
        return len(self.stack) == 0

    def push(self, item):
        self.stack.append(item)
        return True

    def pop(self):
        if self.isEmpty():
            return 0
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
print(s.peek())
print(s.size())
print(s.pop())
print(s.peek())
print(s.show())
