# Time Complexity : O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

# defining a class followed by the functions
class myStack:
    def __init__(self):
        self._stack = []

    def isEmpty(self):
        return len(self._stack) <= 0

    def push(self,data):
        self._stack.append(data)

    def pop(self):
        self._stack.top()

    def pop(self):
        self._stack.pop()


    def peek(self):
        return self._stack[-1]

    def size(self):
        return len(self._stack)

    def show(self):
        return self._stack


#creating a stack followed by the operations on the stack
s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())