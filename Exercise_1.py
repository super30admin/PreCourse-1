# Time Complexity : everything is O(1)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no


# Your code here along with comments explaining your approach


class myStack:
    # Please read sample.java file before starting.
    # Kindly include Time and Space complexity at top of each file
    def __init__(self):
        self.arr = []

    def isEmpty(self):
        if len(self.arr) == 0:
            return True
        return False

    def push(self, item):
        self.arr.append(item)

    def pop(self):
        return self.arr.pop()

    def peek(self):
        return self.arr[-1]

    def size(self):
        return len(self.arr)

    def show(self):
        return self.arr


s = myStack()
s.push("1")
s.push("2")
print(s.pop())
print(s.show())
