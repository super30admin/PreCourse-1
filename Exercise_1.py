class myStack:
    # Please read sample.java file before starting.
    # Kindly include Time and Space complexity at top of each file
    # Time Complexity : O(n)
    # Space Complexity : O(n)
    # Did this code successfully run on Leetcode : I did not find the exact question on Leetcode
    # Any problem you faced while coding this : No
    def __init__(self):
        self.stack = []
        self.count = -1

    def isEmpty(self):
        if len(self.stack) == 0:
            return True
        else:
            return False

    def push(self, item):
        self.stack.append(item)

    def pop(self):
        if len(self.stack) > 0:
            return self.stack.pop()
        else:
            pass

    def peek(self):
        if len(self.stack) > 0:
            return self.stack[-1]
        else:
            pass

    def size(self):
        return len(self.stack)

    def show(self):
        for i in self.stack:
            print(i)


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
