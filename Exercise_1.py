# Time Complexity : push: O(1), pop: O(1), show: O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

class myStack:
    arr = []
    def __init__(self):
        self.arr = []

    def isEmpty(self):
        return len(self.arr) == 0

    def push(self, item):
        self.arr.append(item)

    def pop(self):
        return self.arr.pop()

    def peek(self):
        return self.arr[-1]

    def size(self):
        return len(self.arr)

    def show(self):
         print(self.arr)

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
