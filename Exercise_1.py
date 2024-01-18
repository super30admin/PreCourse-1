# Time Complexity : all operations O(1) except show. show() is O(end) where end = items in the array
# Space Complexity : O(n) where n = total number of push operations
# Did this code successfully run on Leetcode : Could not find this on leetcode
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
class myStack:
    # Please read sample.java file before starting.
    # Kindly include Time and Space complexity at top of each file
    def __init__(self):
        self.stack = []
        # end will be incremented or decremented based on push or pop
        self.end = -1

    def isEmpty(self):
        return self.end == -1

    def push(self, item):
        self.end += 1
        self.stack.insert(self.end, item)
        return None

    def pop(self):
        if self.end == -1:
            return
        removedItem = self.stack[self.end]
        self.end -= 1
        return removedItem

    def peek(self):
        if self.end >= 0:
            return self.stack[self.end]
        return None

    def size(self):
        return self.end + 1

    def show(self):
        for i in range(0, self.end + 1):
            print(self.stack[i])


s = myStack()
s.push("1")
s.push("2")
print(s.pop())
print(s.show())
