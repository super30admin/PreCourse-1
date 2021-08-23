"""
Problem: Implement Stack Using Array

Time Complexity:
    * __init__  : O(1)
    * isEmpty   : O(1)
    * push      : O(1)
    * pop       : O(1)
    * peek      : O(1)
    * size      : O(1)
    * show      : O(1)

Space Complexity:
    * __init__  : O(1)
    * isEmpty   : O(1)
    * push      : O(1)
    * pop       : O(1)
    * peek      : O(1)
    * size      : O(1)
    * show      : O(1)

Pass on LeetCode: N/A
Problems Occurred: N/A
"""


class myStack:
    def __init__(self):
        self.stack = []

    def isEmpty(self):
        return not self.stack

    def push(self, item):
        self.stack.append(item)

    def pop(self):
        return self.stack.pop()

    def peek(self):
        return self.stack[-1]

    def size(self):
        return len(self.stack)

    def show(self):
        return self.stack


s = myStack()
s.push("1")
s.push("2")
print(s.pop())
print(s.show())