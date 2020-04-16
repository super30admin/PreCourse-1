# Time Complexity:
# Space Complexity:
# Did this code successfully run on Leetcode: Not in Leetcode, Executed in PyCharm
# Any problem you faced while coding this: Understanding time and space complexity
class myStack:
    def __init__(self):
        self.var = []

    def isEmpty(self):
        return len(self.var) == 0

    def push(self, item):
        self.var.append(item)

    def pop(self):
        return self.var.pop()

    def peek(self):
        return self.var[-1]

    def size(self):
        return len(self.var)

    def show(self):
        return self.var


s = myStack()
s.push('1')
s.push('2')
print("peeked value is", s.peek())
print("popped value is", s.pop())
print(s.show())
print("the list is empty: ", s.isEmpty())
