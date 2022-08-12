# TIME COMPLEXITY: 
# O(N) - for push, and pop operation
# O(1) - for peek operation

# SPACE COMPLEXITY: O(N)
# Did this code successfully run on Leetcode : Sorry, I did not find similar problem. This code works and it is tested by me.
# Any problem you faced while coding this:
# 1. Was confused with pop operation. But rectified it soon.
# 2. Tried to writing code less verbatim, it threw errors, but again rectified it. Gotta be careful!!!


class myStack:

    # Please read sample.java file before starting.
    # Kindly include Time and Space complexity at top of each file
    def __init__(self):
        self.arr = []

    def isEmpty(self):
        if len(self.arr):
            return False
        else:
            return True

    def push(self, item):
        self.arr = [item] + self.arr

    def pop(self):
        if len(self.arr):
            first_element = self.arr[0]
            self.arr = self.arr[1:]
            return first_element + ' poped'
        else:
            return 'STACK UNDERFLOW EXCEPTION'

    def peek(self):
        if len(self.arr):
            return self.arr[0]
        else:
            return 'STACK UNDERFLOW EXCEPTION'

    def size(self):
        return len(self.arr)

    def show(self):
        return self.arr


s = myStack()
print(s.show())
s.push('1')
s.push('2')
print(s.show())
print(s.pop())
print(s.isEmpty())
print(s.show())
print(s.peek())
print(s.pop())
print(s.show())
print(s.peek())
print(s.isEmpty())
print(s.pop())
print(s.show())
