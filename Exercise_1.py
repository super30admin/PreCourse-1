# Time Complexity : O(1) constant time for every operation
# Space Complexity : O(n) space, where n is the size of the stack
# Did this code successfully run on Leetcode : N.A.
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
class myStack:

    def __init__(self):
        # Container for stack
        self.arr = []

    def isEmpty(self):
        # if len == 0, then stack isEmpty
        return len(self.arr) == 0

    def push(self, item):
        # adding item to the end of container
        self.arr.append(item)

# since len is an O(1) operation, refactored code to not hold top pointer
    def pop(self):
        # removing and returning top element
        if not self.size() == 0:
          return self.arr.pop(len(self.arr) - 1)

    def peek(self):
        # returning top element without removal
        if not self.size() == 0:
          return self.arr[len(self.arr) - 1]

    def size(self):
        # length of array
        return len(self.arr)


s = myStack()
for i in range(0, 10):
    s.push(i)
    # print(s.size())
print(s.isEmpty())
# print(s.pop())
# print(s.peek())
# print (s.pop())

for i in range(0, len(s.arr)):
    # print(s.pop())
    assert(s.peek() == s.pop())

print(s.isEmpty())
