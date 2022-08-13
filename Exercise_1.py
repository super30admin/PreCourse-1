class myStack:
    # Time complexity: push = O(1), pop = O(1), peek = O(1), size = O(1)
    # Space complexity: push = O(1),pop = O(1), peek = O(1), size = O(1)
    # Works on Leetcode: Yes
    # Problems faced while solving: none
    # Kindly include Time and Space complexity at top of each file
    def __init__(self):
        self.stack = []

    def isEmpty(self):
        return self.stack == []

    def push(self, item):
        self.stack.append(item)

    def pop(self):
        return self.stack.pop()

    def peek(self):
        return self.stack[len(self.stack) - 1]

    def size(self):
        return self.stack.len()

    def show(self):
        return self.stack


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
