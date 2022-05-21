""""// Time Complexity : 26ms
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach"""


class myStack:

    def __init__(self):
        self.stack = []
    def isEmpty(self):
        return self.stack == []
    def push(self, item):
        self.stack.append(item)
    def pop(self):
        if (not self.isEmpty()):
            lastElement = self.stack[-1]  # Copying the last element to return
            del (self.stack[-1])  # Deleting the last element
            return lastElement
        else:
            return ("Stack Already Empty")
    def peek(self):
        if (self.isEmpty()):
            return ("Stack Already Empty")
        return self.stack[-1]
    def size(self):
        return len(self.stack)
    def show(self):
        print(self.stack)

s = myStack()
s.push('1')
s.push('2')
s.push('5')
s.push('9')
print(s.size())
print(s.show())
print(s.peek())
print(s.pop())
print(s.pop())
print(s.pop())
print(s.isEmpty())
print(s.show())